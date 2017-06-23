package com.example.abituriente;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = (Button)findViewById(R.id.button);
        but.setText("Начало");
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();  //объявление класса
                ft.replace(R.id.Activ1, MainFragment.newInstance(1,"Ухаживать за животными","Обслуживать машины, приборы (следить, регулировать)","ДАЛЕЕ"));   //сам процесс добавления
                ft.commit(); //обязательная функция для того чтобы завершить
            }
        });
    }

}
