package com.example.abituriente;

import android.content.Context;

import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Main2Activity extends Fragment {
    TextView PervText,VtorText,TretText,ChetText,PetText;
    ProgressBar PervProg,VtorProg,TertProg,ChetProg,PetProg;
    int One,Two,Three,Four,Five;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rot = inflater.inflate(R.layout.activity_main2, container, false);
        PervText = (TextView) rot.findViewById(R.id.textView8);
        VtorText = (TextView) rot.findViewById(R.id.textView9);
        TretText = (TextView) rot.findViewById(R.id.textView10);
        ChetText = (TextView) rot.findViewById(R.id.textView11);
        PetText = (TextView) rot.findViewById(R.id.textView12);
        PervProg = (ProgressBar)rot.findViewById(R.id.progressBar2);
        VtorProg = (ProgressBar)rot.findViewById(R.id.progressBar3);
        TertProg = (ProgressBar)rot.findViewById(R.id.progressBar4);
        ChetProg = (ProgressBar)rot.findViewById(R.id.progressBar5);
        PetProg = (ProgressBar)rot.findViewById(R.id.progressBar6);
        return rot;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        One = getArguments().getInt("One");
        Two = getArguments().getInt("Two");
        Three = getArguments().getInt("Three");
        Four = getArguments().getInt("Four");
        Five = getArguments().getInt("Five");
    }
    public static MainFragment newItens(int One, int Two, int Three,int Four,int Five) {

        Bundle args = new Bundle();
        args.putInt("One",One);
        args.putInt("Two",Two);
        args.putInt("Three",Three);
        args.putInt("Four",Four);
        args.putInt("Five",Five);
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
