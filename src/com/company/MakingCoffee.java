package com.company;

public class MakingCoffee {
    public static void main(String[] args) {
        CoffeeMakerClass Nespresso = new CoffeeMakerClass(4,4);
        Nespresso.turnOn();
        Nespresso.isFilter();
        Nespresso.makeCoffee();
    }
}