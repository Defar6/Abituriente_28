package com.example.abituriente;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Defar6 on 29.05.2017.
 */

public class MainFragment extends Fragment {

    int numberPage;
    TextView numberPageText;

    String firstQuestion, secondQuestion;

    CheckBox firstCheck, secondCheck;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main,container,false);
        numberPageText = (TextView)root.findViewById(R.id.textView4);
        firstCheck = (CheckBox)root.findViewById(R.id.checkBox);
        secondCheck = (CheckBox) root.findViewById(R.id.checkBox2);

        numberPageText.setText("n" + numberPage);
        firstCheck.setText(firstQuestion);
        secondCheck.setText(secondQuestion);
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numberPage = getArguments().getInt("numberPage");
        firstQuestion = getArguments().getString("firstQuestion");
        secondQuestion = getArguments().getString("secondQuestion");
    }

    public static MainFragment newInstance(int numberPage, String firstQuestion, String secondQuestion) {
        
        Bundle args = new Bundle();
        args.putInt("numberPage",numberPage);
        args.putString("firstQuestion",firstQuestion);
        args.putString("secondQuestion",secondQuestion);
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
