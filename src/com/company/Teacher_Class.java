package com.company;

public class Teacher_Class {

    String answer;

    public Teacher_Class(){
        this.answer="A tarnár válaszol a kérdésre";
    }
    public void answer(){

    }
    public void teach(Student_Class learn){
        learn.learn();
    }
}
