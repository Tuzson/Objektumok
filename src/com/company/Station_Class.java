package com.company;

public class Station_Class {
    int gasAmount;

    public Station_Class() {
        this.gasAmount = 1000;

    }

    public void refillCar(Car_Class car1) {
        System.out.println("tankolás");
        this.gasAmount -= car1.capacity;
        car1.gasAmount = car1.capacity;


//        this.gasAmount -= car1.capacity;
//        this.gasAmount = car1.capacity;
//        car1.capacity -= car1.gasAmount;
//        System.out.println(car1.capacity);
//        System.out.println(car1.gasAmount);
//    }

    }
}
