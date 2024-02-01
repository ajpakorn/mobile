package com.comsci.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FormStudent extends AppCompatActivity {
public int id;
public String fName;
public String lName;
public String course;
public String grade;
public String score;
public String dob;
public    EditText eid,efname,elname,ecourse,edob,escore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);
    }


    public void saveForm(View view) {
        //binding widget
        eid = (EditText)findViewById(R.id.edit_id) ;
        efname =  (EditText)findViewById(R.id.edit_first_name);
        elname =  (EditText)findViewById(R.id.edit_last_name);
        ecourse =  (EditText)findViewById(R.id.edit_course);
        edob =  (EditText)findViewById(R.id.edit_date_of_birth);
        escore =  (EditText)findViewById(R.id.edit_score);
        //get data from form
        id=Integer.parseInt(eid.getText().toString());
        fName=efname.getText().toString();
        lName=elname.getText().toString();
        course = ecourse.getText().toString();
        grade=escore.getText().toString(); dob=edob.getText().toString();
        //create object and new argument
        Student std =new Student(id,fName,lName,course,grade,dob);

        ArrayList<String> stdList = new ArrayList<>();
        stdList.add("id: "+std.getId());
        stdList.add("First Name: "+std.getFirstName());
        stdList.add("Last Name: "+std.getLastName());
        stdList.add("Course: "+std.getLevel());
        stdList.add("Score: "+std.getGrade());
        for(String s:stdList) {
            System.out.println(s);
        }
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(std);
        for(Student st: arr){
            System.out.println(st);
        }
        clearForm();
        Toast.makeText(this, "Saved form successfully.", Toast.LENGTH_SHORT).show();
    }
    public void clearForm(){
        eid.setText("");
        efname.setText("");
        elname.setText("");
        ecourse.setText("");
        escore.setText("");
        edob.setText("");
    }

    public void report(View view) {
        ///TODO next week
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}