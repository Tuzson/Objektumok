package com.company;

public class Hoover {
    boolean plugIn;
    boolean turn ;
    boolean  isItFull;
    int fullness;
    public Hoover(){
    }
    public  void plugIn(){
        plugIn = true;
    }
    public  void plugOff(){
        plugIn = false;
    }
    public  void turnOn(){
        turn = true;
    }
    public  void turnOff(){
        turn = true;
    }
    public boolean isItFull( ) {
        isItFull = !isItFull;
        return isItFull;
    }
}
