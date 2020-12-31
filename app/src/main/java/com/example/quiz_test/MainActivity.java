package com.example.quiz_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv1,tv2,tv3;
    RadioButton a,b,c,d;
    Button bt;
    RadioGroup rg;
    int q,s,i=0;

    ArrayList<Integer> a1=new ArrayList<Integer>();

    public void check(){
        if(b.isChecked() &&  tv1.getText().equals("When did India its independece?")) {
            s = s + 10;
        }
        if(a.isChecked() &&  tv1.getText().equals("Who is India's father of nation?")) {
            s = s + 10;
        }
        if(b.isChecked() &&  tv1.getText().equals("Who was first Indian lady to go in space?")) {
            s = s + 10;
        }
        if(d.isChecked() &&  tv1.getText().equals("Who designed India's national flag?")) {
            s = s + 10;
        }
        if(c.isChecked() &&  tv1.getText().equals("Who was the first lady CM of Uttar Pradesh?")) {
            s = s + 10;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        tv1=(TextView)findViewById(R.id.ques);
        tv2=(TextView)findViewById(R.id.response);
        tv3=(TextView)findViewById(R.id.score);
        rg=(RadioGroup)findViewById(R.id.optionGroup);
        a=(RadioButton)findViewById(R.id.option1);
        b=(RadioButton)findViewById(R.id.option2);
        c=(RadioButton)findViewById(R.id.option3);
        d=(RadioButton)findViewById(R.id.option4);
        bt=(Button)findViewById(R.id.next);
        q=0;
        s=0;

    }



    public void quiz(View v){
        ed1.setFocusable(false);

        double randomDouble = Math.random();
        randomDouble = randomDouble * 4;
        int randomInt = (int) randomDouble;

        if(randomInt==0){
            List<Integer> anotherList = Arrays.asList(0,1,2,3,4,5);
            a1.addAll(anotherList);
        }
        else if(randomInt==1){
            List<Integer> anotherList = Arrays.asList(3,1,4,0,2,5);
            a1.addAll(anotherList);
        }
        else if(randomInt==2){
            List<Integer> anotherList = Arrays.asList(2,3,4,1,0,5);
            a1.addAll(anotherList);
        }
        else if(randomInt==3){
            List<Integer> anotherList = Arrays.asList(4,3,1,0,2,5);
            a1.addAll(anotherList);
        }
        else{
            List<Integer> anotherList = Arrays.asList(1,0,4,2,3,5);
            a1.addAll(anotherList);
        }


        switch ((int)a1.get(q)){
            case 0:
            {
                check();
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText("Next");


                tv1.setText("When did India its independece?");
                a.setText("1847");
                b.setText("1947");
                c.setText("1850");
                d.setText("1950");
                q++;

                break;
            }
            case 1:
            {
                check();
                tv3.setText("");
                rg.setVisibility(View.VISIBLE);
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                bt.setText("Next");
                ed1.setEnabled(false);
                tv1.setText("Who is India's father of nation?");
                a.setText("Mahatma Gandhi");
                b.setText("Lal Bahadur Shashtri");
                c.setText("Jawaharlal Nehru");
                d.setText("Subhash Chandra Bose");

                q++;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2:
            {
                check();
                tv3.setText("");
                rg.setVisibility(View.VISIBLE);
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                bt.setText("Next");
                tv1.setText("Who was the first lady CM of Uttar Pradesh?");
                a.setText("Pratibha Singh Patil");
                b.setText("Indira Gandhi");
                c.setText("Sucheta Kriplani");
                d.setText("Mayawati");
                q++;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3:
            {
                check();
                tv3.setText("");
                rg.setVisibility(View.VISIBLE);
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                bt.setText("Next");
                tv1.setText("Who was first Indian lady to go in space?");
                a.setText("Mayawati");
                b.setText("Kalpana Chawla");
                c.setText("Kiran Bedi");
                d.setText("Sunita Williams");
                q++;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4:
            {
                tv3.setText("");
                check();
                rg.setVisibility(View.VISIBLE);
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                bt.setText("Next");
                tv1.setText("Who designed India's national flag?");
                a.setText("Rahul Gandhi");
                b.setText("Bankim Chandra Chatterjee");
                c.setText("Ishwar Chandra Vidyasagar");
                d.setText("Pingali Venkayya");
                q++;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);

                break;
            }
            case 5:
            {
                check();
                bt.setText("Finish");
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                tv3.setText(ed1.getText()+"'s final score is "+s);
                bt.setText("Restart");
                q=0;
                s=0;
                break;
            }

        }


    }
}