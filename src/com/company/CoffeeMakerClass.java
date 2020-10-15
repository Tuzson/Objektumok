package com.company;

public class CoffeeMakerClass {
    double water;
    double coffee;
    boolean filter = false;
    boolean voltage = false;

    public CoffeeMakerClass(double water, double coffee) {
        this.water = water;
        this.coffee = coffee;
    }

    public boolean turnOn() {
        return voltage = true;
    }

    public boolean isFilter() {
        return filter = true;
    }

    public void makeCoffee() {
        if (!voltage && !filter) {
            System.out.println("Kapcsold be és tegyél bele szűrőt");
        }
        if (voltage && filter) {
            if (coffee > water) {
                System.out.println(" Túl kevés a víz");

            } else if (coffee * 2 > water) {
                System.out.println("Erős kávét főztél");
            } else{
                System.out.println("Gyenge kávét főztél");
            }
        }
    }
 }