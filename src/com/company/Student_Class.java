package com.company;

public class Student_Class {
    String learn;

    public Student_Class(){
        this.learn = "A diák tanul valami újat";
    }
    public void learn(){
    }
    public void question(Teacher_Class answer){
        answer.answer();
    }
}
