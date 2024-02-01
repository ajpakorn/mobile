package com.comsci.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
public Student std1,std2;
public TextView textView1,tv2 ;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        std1= new Student(1,"Somchai","Ssss","Mobile development","2.3","12/1/22");
        std2 = new Student();
        std2.setId(2);std2.setLevel("Java OOP");
        std2.setFirstName("Somying");
        std2.setLastName("Jaidee");
        std2.setDateOfBirth("2/2/2021");
        std2.setGrade("3.0");

        textView1 = (TextView) findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        button = (Button)findViewById(R.id.bt1);
        textView1.setText("ID: " +
                String.valueOf(std1.getId()) +
                "\nFirst Name: "+std1.getFirstName()+
                "\nLast Name: "+std1.getLastName() +
                "\nCourse : "+std1.getLevel() +"\n+++++++++++++++");


        tv2.setText("ID: " +
                String.valueOf(std2.getId()) +
                "\nFirst Name: "+std2.getFirstName()+
                "\nLast Name: "+std2.getLastName() +
                "\nCourse : "+std2.getLevel() +"\nScore :"+std2.getGrade()+
                "\n+++++++++++++++");


         Log.d("info","ID: "+std1.toString() );

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
               Intent i = new Intent(MainActivity.this,FormStudent.class);
               startActivity(i);
             }
         });
    }
}