package com.company;

public class PirateMain {
    public static void main(String[] args) {

        ShipClass ship1 = new ShipClass();
        ShipClass ship2 = new ShipClass();

        ship1.fillShip();
        ship2.fillShip();

        ship1.battle(ship2);

    }
}
