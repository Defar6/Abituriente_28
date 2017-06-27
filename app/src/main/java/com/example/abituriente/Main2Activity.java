package com.example.abituriente;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;


import static java.security.AccessController.getContext;

public class Main2Activity extends Activity {
    Button byt;
    TextView PervText,VtorText,TretText,ChetText,PetText;
    ProgressBar PervProg,VtorProg,TertProg,ChetProg,PetProg;
    double One,Two,Three,Four,Five;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        byt = (Button) findViewById(R.id.button5);
        PervText = (TextView) findViewById(R.id.textView8);
        VtorText = (TextView) findViewById(R.id.textView9);
        TretText = (TextView) findViewById(R.id.textView10);
        ChetText = (TextView) findViewById(R.id.textView11);
        PetText = (TextView) findViewById(R.id.textView12);
        PervProg = (ProgressBar)findViewById(R.id.progressBar2);
        PervProg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        VtorProg = (ProgressBar)findViewById(R.id.progressBar3);
        VtorProg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        TertProg = (ProgressBar)findViewById(R.id.progressBar4);
        TertProg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        ChetProg = (ProgressBar)findViewById(R.id.progressBar5);
        ChetProg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        PetProg = (ProgressBar)findViewById(R.id.progressBar6);
        PetProg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        Bundle extras = getIntent().getExtras();
        One = (extras.getDouble("one"))/8*100;
        Two = (extras.getDouble("two"))/8*100;
        Three = (extras.getDouble("three"))/8*100;
        Four = (extras.getDouble("four"))/8*100;
        Five = (extras.getDouble("five"))/8*100;
        PervText.setText("Человек-природа  "+String.valueOf(One)+"%");
        PervProg.setProgress((int)One);
        VtorText.setText("Человек-техника  "+String.valueOf(Two)+"%");
        VtorProg.setProgress((int)Two);
        TretText.setText("Человек-человек  "+String.valueOf(Three)+"%");
        TertProg.setProgress((int)Three);
        ChetText.setText("Человек-знаковая система  "+String.valueOf(Four)+"%");
        ChetProg.setProgress((int)Four);
        PetText.setText("Человек-художественный образ  "+String.valueOf(Five)+"%");
        PetProg.setProgress((int)Five);
        byt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(this, Main3Activity.class);
                startActivity(intent3);
            }
        });
    }

}
