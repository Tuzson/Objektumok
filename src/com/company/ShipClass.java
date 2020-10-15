package com.company;

public class ShipClass {
    PirateClass[] crew = new PirateClass[50];
    int counter;


    public void fillShip() {
        for (int i = 0; i < crew.length; i++) {
            crew[i] = new PirateClass();
        }
    }

    public void battle(ShipClass otherShip) {
        int counter = 0;
        int counter1 = 0;

        for (int i = 0; i < crew.length; i++) {
            crew[i].brawl(otherShip.crew[i]);
            if (crew[i].health > 0) {
                counter++;
            }
            else if (otherShip.crew[i].health > 0) {
                counter1++;
            }
        }
        if (counter > counter1) {
            System.out.println(" Az első hajó nyert, túlélők: " + counter);
        }
        if (counter < counter1) {
            System.out.println("A második hajó nyert, túlélők: " + counter1);
        }
    }
}
