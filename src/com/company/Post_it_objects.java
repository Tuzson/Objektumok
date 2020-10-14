package com.company;

public class Post_it_objects {
    public static void main(String[] args) {
        Postlt postit1 = new Postlt("orange", "Ötlet 1", "blue");
        Postlt postit2 = new Postlt("red","Király","black");
        Postlt postit3 = new Postlt("yellow","Megcsinálni a házit","green");
        System.out.println(postit1.backgroundColor + postit1.text + postit1.textColor);

    }
}