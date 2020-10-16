package com.company;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
//        int[] gear ={45,30,25,20,15,10};
        BicycleClass peugeot = new BicycleClass(0.66);
        int inGear;
        double revPerSec;
        double speed;
        boolean correct= false;
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Írd be melyik fokozatba szeretnél tekerni");
        inGear = sc.nextInt();
        Scanner ss = new Scanner(System.in);
        while (!correct) {
            System.out.println("Sebesség vagy tekerési fordulatra vagy kíváncsi?");
            answer = ss.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("tekerési fordulat")) {
                System.out.println("Add meg a sebességet (km/h)");
                speed = ss.nextDouble();
                System.out.println("Akkor a tekerésed száma :" + peugeot.getRevPerSec(speed) + " másodpercenként.");
                correct = true;
            } else if (answer.equals("sebesség")) {
                System.out.println("Add meg a tekerési fordulatot (1/sec)");
                revPerSec = ss.nextDouble();
                System.out.println("A sebességed :" + peugeot.getSpeed(revPerSec) + " km/h");
                correct = true;
            } else {
                System.out.println("Nem érted a kérdést????????????????? Válaszolj pontosan!");
            }
        }
    }
}