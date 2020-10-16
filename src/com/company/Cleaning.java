package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Cleaning {
    public static void main(String[] args) throws InterruptedException {
        String ok;
        int speed;
        int dustLevel;
        Hoover dyson = new Hoover();
        System.out.println("Milyen gyorsan porszivózol? (1-5)");
        Scanner sc = new Scanner(System.in);
        speed = sc.nextInt();
        System.out.println("Milyen poros a lakás? (1-5)");
        dustLevel = sc.nextInt();
        System.out.println(100 - ((speed + dustLevel - 1) * 10) + " perc múlva telítődik meg a porzsák! ");
        System.out.println(" Kezdj porszívózni! ");
        TimeUnit.SECONDS.sleep(5);
        dyson.isItFull();
        if (dyson.isItFull) {
            System.out.println("  Kapcsold ki majd húzd ki a dúgót. Űritsd ki a porzsákot. Ki űritetted? Írd ok,ha megvan.");
            dyson.turnOff();
            dyson.plugOff();
            Scanner ss = new Scanner(System.in);
            ok = ss.nextLine();
            if (!dyson.turn && !dyson.plugIn) {
                dyson.isItFull();
            }
            System.out.println("Dugd vissza a dugót és kapcsold be a porszívót. ");
            dyson.plugIn();
            dyson.turnOn();
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Tiszta a lakás. Kapcsold ki majd húzd ki a dúgót. Űritsd ki a porzsákot.Ha végeztél rakd el a porszívót!");
        }
    }
}
