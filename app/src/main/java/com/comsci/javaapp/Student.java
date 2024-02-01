package com.comsci.javaapp;

public class Student {
    //data member, attribute
    private  int id=0;
    private  String firstName=null;
    private String lastName=null;
    private String Level=null;
    private String grade=null;
    private String dateOfBirth;
public Student(){}
    public Student(int id, String firstName, String lastName, String level, String grade, String dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Level = level;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //method
   public void setId(int nId){
        this.id=nId;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLevel() {
        return Level;
    }

    public String getGrade() {
        return grade;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Level='" + Level + '\'' +
                ", grade='" + grade + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public int getId() {
    return this.id;
    }


//    public String toString(){
//        String info="ID : "+this.id;
//        return info;
//    }

}
