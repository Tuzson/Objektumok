package com.company;

public class StudentTeacher {
    public static void main(String[] args) {
        Student_Class student1 = new Student_Class();
        Teacher_Class teacher1 = new Teacher_Class();
        School(student1,teacher1);
    }
    public static void School (Student_Class student,Teacher_Class teacher){
        student.question(teacher);
        teacher.teach(student);
        System.out.println(student.learn);
        System.out.println(teacher.answer);
    }
}
