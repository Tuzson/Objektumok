package com.company;

public class Car_Class {
     int gasAmount;
     int capacity;


    public Car_Class(){
        this.gasAmount = 0;
        this.capacity = 100;
    }
public void carRefill(Station_Class petrol){
        this.capacity -= this.gasAmount;
}
}
