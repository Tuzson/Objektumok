package com.company;

public class CounterClass {
    int value;
    int reset;

    public CounterClass(){
        this.value = 1;
        reset = this.value;
    }
    public void addNumber(int number){
        value+=number;
    }
    public void add(){
        value++;
    }
    public void get(){
        System.out.println(value);
    }
    public void reset(){
        value = reset;
    }
}
