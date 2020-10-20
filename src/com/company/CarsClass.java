package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CarsClass {
    private int[][] time;
    private int[] spentTimeOnTheRoad;
    private String[] cityFrom;

    public void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Txt files/forgalom.txt"));
        int row = sc.nextInt();
        int [][] forgalom = new int[row][5];
        String[][]forgalom2 = new String[row][5];
        time = new int[row][3];
        spentTimeOnTheRoad = new int[row];
        cityFrom = new String[row];
        for (int i = 0;sc.hasNext(); i++) {
            forgalom[i][0] = sc.nextInt();
            forgalom[i][1] = sc.nextInt();
            forgalom[i][2] = sc.nextInt();
            forgalom[i][3] = sc.nextInt();
            forgalom2[i][4] = sc.next();
            time[i][0] = forgalom[i][0];
            time[i][1] = forgalom[i][1];
            time[i][2] = forgalom[i][2];
            spentTimeOnTheRoad[i] = forgalom[i][3];
            cityFrom[i] = forgalom2[i][4];
        }
    }

    //Írja ki a képernyőre, hogy az n-edikként belépő jármű melyik város felé haladt! Ehhez
    //kérje be a felhasználótól az n értékét!
    public void nDriverCityFrom(int n) throws FileNotFoundException {
        readFromFile();
        if (cityFrom[n].equals("F")){
            System.out.println("A " + n + ". belépő az alsó város felé halad");
        }
        if (cityFrom[n].equals("A")){
            System.out.println("A " + n + ". belépő a felső város felé halad");
        }
    }
    //Írja a képernyőre, hogy a Felső város irányába tartó utolsó két jármű hány másodperc kü-
    //lönbséggel érte el az útszakasz kezdetét!
    public void lastTwoUpperCity() throws FileNotFoundException {
        readFromFile();
        int result;
        int i;
        int sum= 0;
        int sum2 = 0;
        int counter= 0;
        for ( i = cityFrom.length-1; i >= 0; i--) {
            if (cityFrom[i].equals("A") && counter < 2){
                counter++;
                if (counter ==1){
                    sum += ((time[i][0] * 3600) + (time[i][1] * 60) + time[i][2]);
                }
                if (counter == 2){
                    sum2 += ((time[i][0] * 3600) + (time[i][1] * 60) + time[i][2]);
                }
            }
        }
        result = sum - sum2;
        System.out.println("A két utolsó jármű " + result + " másodperc különbséggel érte el az útszakasz kezdetét.");
    }

    public void counterCityFrom () throws FileNotFoundException {
        readFromFile();
        int counterA = 0;
        int counterF = 0;
        int hour = time[0][0];
        for (int i = 0; i < cityFrom.length-1; i++) {
            if (cityFrom[i].equals("A") &&time[i+1][0] == hour ){
                counterA++;
            }
            else if (cityFrom[i].equals("F") && time [i+1][0] == hour){
                counterF++;
            }
            else if (cityFrom[i].equals("A") &&time[i][0] == hour){
                counterA++;
                System.out.println(hour + " órakor az alsó város felől :" + counterA + " db, a felső város felől: " + counterF + " db jármű érkezett");
                counterA = 0;
                counterF = 0;
                hour++;
            }
            else {
                counterF++;
                System.out.println(hour + " órakor az alsó város felől :" + counterA + " db, a felső város felől: " + counterF + " db jármű érkezett");
                counterA = 0;
                counterF = 0;
                hour++;
            }
        }
        System.out.println(hour + " órakor az alsó város felől :" + counterA + " db, a felső város felől: " + counterF + " db jármű érkezett");

    }
    public int[] fastest10Car (int[] array) throws FileNotFoundException {
        readFromFile();
        int min = Integer.MAX_VALUE;
        int [] fastest10Car = new int[10];
        fastest10Car[0] = array[0];
        for (int i = 0; i < fastest10Car.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (min > array[j] && array[j] != fastest10Car[i]){
                    min = array[j];
                    fastest10Car[i] =min;
                }
            }
        }return fastest10Car;
    }
    public void fastest10CarWithTime() throws FileNotFoundException {
        readFromFile();
        float speed;
        int counter = 1;
        int[] fastest10Car = fastest10Car(spentTimeOnTheRoad);
        for (int i = 0; i < fastest10Car.length; i++) {
            for (int j = 0; j < spentTimeOnTheRoad.length; j++) {
                if (fastest10Car[i] == spentTimeOnTheRoad[j]){
                    speed = 1000 / fastest10Car[i];
                    System.out.println("A(z) " + counter + ". leggyorsabb autó adatai: " + " belépési ideje: " + time[j][0] + ":" + time[j][1] + ":" + time[j][2] + ", " + cityFrom[j] + " felől érkezett, sebessége:" + speed + " m/s");
                    counter++;
                }
            }
        }
    }
}