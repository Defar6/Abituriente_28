package com.example.abituriente;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Defar6 on 29.05.2017.
 */

public class MainFragment extends Fragment {
    int i;
    int numberPage;
    TextView numberPageText;
    ProgressBar Porg;
    String firstQuestion, secondQuestion,butatext;
    Button buta;
    CheckBox firstCheck, secondCheck;

    String[] firstMass = {"Помогать больным людям, лечить их",
            "Следить за качеством книжных иллюстраций, плакатов, художественных открыток, грампластинок",
            "Обрабатывать материалы (дерево, ткань, металл, пластмассу и т. п.)",
    "Обсуждать научно-популярные книги, статьи",
    "Выращивать молодняк (животных какой-либо породы)",
    "Копировать рисунки, изображения (или настраивать музыкальные инструменты)",
            "Сообщать, разъяснять людям, нужные им сведения",
     "Ремонтировать вещи, изделия (одежду, технику), жилище",
            "Лечить животных",
            "Выводить новые сорта растений",
            "Разбирать споры, ссоры между людьми, убеждать, разъяснять, уточнять, разъяснять, поощрять, наказывать",
            "Наблюдать, изучать работу кружков художественной самодеятельности",
            "Обслуживать, налаживать медицинские приборы, аппараты",
            "Составлять точные описания — отчеты о наблюдаемых явлениях, событиях, измеряемых объектах и др.",
            "Делать лабораторные анализы в больнице",
            "Красить или расписывать стены помещений, поверхность изделий",
            "Организовывать культпоходы сверстников или младших (в театры, музеи), экскурсии, туристские походы и т. п.",
            "Изготовлять по чертежам детали (машины, одежду), строить здания",
            "Вести борьбу с болезнями растений, с вредителями леса, сада"};
    String[] secondMass = {"Составлять таблицы, схемы, программы вычислительных машин",
                  "Следить за состоянием, развитием растений",
            "Доводить товары до потребителя (рекламировать, продавать)",
            "Обсуждать художественные книги (или пьесы, концерты)",
            "Тренировать товарищей (или младших) в выполнении каких-либо действий (трудовых, спортивных)",
            "Управлять каким-либо грузовым (подъемным или транспортным) средством — подъемным краном, трактором, тепловозом и др.",
            "Художественно оформлять выставки, витрины (или участвовать в подготовке пьес, концертов)",
            "Искать и исправлять ошибки в текстах, таблицах, рисунках",
            "Выполнять вычисления, расчеты",
            "Конструировать, проектировать новые виды промышленных изделий (машины или одежду, дома, продукты питания и т. п.)",
            "Разбираться в чертежах, схемах, таблицах (проверять, приводить в порядок)",
            "Наблюдать, изучать жизнь микробов",
            "Оказывать людям медицинскую помощь при ранениях, ушибах, ожогах и т. п.",
            "Художественно описывать, изображать события (наблюдаемые или представляемые)",
            "Принимать, осматривать больных, беседовать с ними, назначать лечение",
            "Осуществлять монтаж здания или сборку машин, приборов",
            "Играть на сцене, принимать участие в концертах",
            "Заниматься черчением, копировать чертежи, карты",
            "Работать на клавишных машинах (пишущей машинке, телетайпе, наборной машине и др.)"};

   int One,Two,Three,Four,Five;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main,container,false);
        i=0;
        numberPageText = (TextView)root.findViewById(R.id.textView4);
        firstCheck = (CheckBox)root.findViewById(R.id.checkBox);
        secondCheck = (CheckBox) root.findViewById(R.id.checkBox2);
        buta = (Button) root.findViewById(R.id.button32);
        Porg =(ProgressBar) root.findViewById(R.id.progressBar);
        Porg.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
        numberPageText.setText( numberPage + "/20" );
        firstCheck.setText(firstQuestion);
        secondCheck.setText(secondQuestion);
        buta.setText(butatext);
        secondCheck.setEnabled(true);
        buta.setEnabled(false);
       firstCheck.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (firstCheck.isChecked()) {
                   secondCheck.setEnabled(false);
                   buta.setEnabled(true);
                   if ((numberPage==1)|(numberPage==6)|(numberPage==10)|(numberPage==11)|(numberPage==16)|(numberPage==20)){
                       One++;
                   }
                   if ((numberPage==4)|(numberPage==9)|(numberPage==14)|(numberPage==19)){
                       Two++;
                   }
                   if ((numberPage==2)|(numberPage==8)|(numberPage==12)|(numberPage==18)){
                       Three++;
                   }
                   if ((numberPage==5)|(numberPage==15)){
                       Four++;
                   }
                   if ((numberPage==3)|(numberPage==7)|(numberPage==13)|(numberPage==17)){
                       Five++;
                   }
               }
               else {
                   secondCheck.setEnabled(true);
                   buta.setEnabled(false);
                   if ((numberPage==1)|(numberPage==6)|(numberPage==10)|(numberPage==11)|(numberPage==16)|(numberPage==20)){
                       One--;
                   }
                   if ((numberPage==4)|(numberPage==9)|(numberPage==14)|(numberPage==19)){
                       Two--;
                   }
                   if ((numberPage==2)|(numberPage==8)|(numberPage==12)|(numberPage==18)){
                       Three--;
                   }
                   if ((numberPage==5)|(numberPage==15)){
                       Four--;
                   }
                   if ((numberPage==3)|(numberPage==7)|(numberPage==13)|(numberPage==17)){
                       Five--;
                   }
               }
           }
       });
        secondCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (secondCheck.isChecked()) {
                    firstCheck.setEnabled(false);
                    buta.setEnabled(true);
                    if ((numberPage==3)|(numberPage==13)){
                        One++;
                    }
                    if ((numberPage==1)|(numberPage==7)|(numberPage==11)|(numberPage==17)){
                        Two++;
                    }
                    if ((numberPage==4)|(numberPage==6)|(numberPage==14)|(numberPage==16)){
                        Three++;
                    }
                    if ((numberPage==2)|(numberPage==9)|(numberPage==10)|(numberPage==12)|(numberPage==19)|(numberPage==20)){
                        Four++;
                    }
                    if ((numberPage==5)|(numberPage==8)|(numberPage==15)|(numberPage==18)){
                        Five++;
                    }
                }
                else {
                    firstCheck.setEnabled(true);
                    buta.setEnabled(false);
                    if ((numberPage==3)|(numberPage==13)) {
                        One--;
                    }
                    if ((numberPage==1)|(numberPage==7)|(numberPage==11)|(numberPage==17)){
                        Two--;
                    }
                    if ((numberPage==4)|(numberPage==6)|(numberPage==14)|(numberPage==16)){
                        Three--;
                    }
                    if ((numberPage==2)|(numberPage==9)|(numberPage==10)|(numberPage==12)|(numberPage==19)|(numberPage==20)){
                        Four--;
                    }
                    if ((numberPage==5)|(numberPage==8)|(numberPage==15)|(numberPage==18)){
                        Five--;
                    }
                }

            }
        });
        buta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstCheck.setChecked(false);
                secondCheck.setEnabled(true);
                secondCheck.setChecked(false);
                firstCheck.setEnabled(true);
                buta.setEnabled(false);
                if (numberPage==20) {
                    FragmentTransaction ftr = getFragmentManager().beginTransaction();
                    ftr.replace(R.id.Activ2, Main2Activity.newItens(One, Two, Three, Four, Five));
                    ftr.commit();
                }
                if(numberPage!=20) {
                    Porg.setProgress(numberPage*5+5);
                    numberPage++;
                    numberPageText.setText(numberPage + "/20");
                    firstCheck.setText(firstMass[i]);
                    secondCheck.setText(secondMass[i]);
                    i++;
                }

            }
        });
        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        numberPage = getArguments().getInt("numberPage");
        firstQuestion = getArguments().getString("firstQuestion");
        secondQuestion = getArguments().getString("secondQuestion");
        butatext = getArguments().getString("butatext");

    }

    public static MainFragment newInstance(int numberPage, String firstQuestion, String secondQuestion,String butatext) {
        
        Bundle args = new Bundle();
        args.putInt("numberPage",numberPage);
        args.putString("firstQuestion",firstQuestion);
        args.putString("secondQuestion",secondQuestion);
        args.putString("butatext",butatext);
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
