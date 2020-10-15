package com.company;

public class PirateClass {
    int alcoholLevel;
    int health;
    int drinkCounter;
    int chance;

    public PirateClass() {
        this.alcoholLevel = 0;
        this.health = 10;
        this.drinkCounter = 0;
        this.chance = 0;
    }

    public void drinkSomeRum() {
        if (health > 0) {
            alcoholLevel++;
            drinkCounter++;
        } else {
            System.out.println("He's dead");
        }
    }

    public void howItGoingMate() {
        if (drinkCounter >= 1 && alcoholLevel >= 0 && alcoholLevel <= 4 && health > 0) {
            System.out.println("Pour me anudder!");
            ;
        } else if (drinkCounter > 1 && alcoholLevel > 4 && health > 0) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            System.out.println("A kalóz kicsit bebaszott ezért most kialudja magát");
            alcoholLevel = 0;
            drinkCounter = 0;
            health = 10;
        } else {
            System.out.println("He's dead");
        }
    }

    public void die() {
        health = 0;
//        System.out.println("He's dead");
    }

    public void brawl(PirateClass pirate1) {
        this.chance = (int) (Math.random() * 3)+1;

        if (this.health > 0 && pirate1.health >0) {
            if (chance ==1){
                pirate1.die();
            }
            if (chance == 2){
                this.die();
            }
            if (chance == 3){
                this.die();
                pirate1.die();
            }
        }else {
            System.out.println("Az egyik kalóz halott");
        }
    }
}
