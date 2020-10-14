package com.company;

public class AnimalClass {
    int hungry;
    int thirsty;


    public AnimalClass(){
        this.hungry= 50;
        this.thirsty = 50;
    }

    public void eat (){
        System.out.println("eating");
        hungry--;
    }
    public void water(){
        System.out.println("drinking");
        thirsty--;
    }
    public void play(){
        System.out.println("play");
        hungry++;
        thirsty++;
    }
    public void game(AnimalClass animal){
        animal.play();
        this.play();
    }
    public void hunt (){
        this.eat();
    }
    public void drink (){
        this.water();
    }
}
