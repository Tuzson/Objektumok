package com.company;

public class AnimalObject {
    public static void main(String[] args) {
        AnimalClass farkas = new AnimalClass();
        AnimalClass medve = new AnimalClass();
        farkas.game(medve);
        System.out.println(farkas.hungry + " " + farkas.thirsty + " " + medve.hungry + " " + medve.thirsty);
        medve.hunt();
        farkas.drink();
        System.out.println("Farkas éhség szint: " + farkas.hungry + ", Farkas szomjúság szint: " + farkas.thirsty + ", Medve éheség szint: " + medve.hungry + ", Medve szomjúság szint: " + medve.thirsty);

    CounterClass number1 = new CounterClass();
    CounterClass number2 = new CounterClass();
    number1.addNumber(12);
    number2.add();
    number1.get();
    number2.get();
    number1.reset();
    number1.get();
    number1.add();
    number1.get();

    }
}
