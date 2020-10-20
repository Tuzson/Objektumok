package company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Roadwork_Main {
    public static void main(String[] args) throws FileNotFoundException {
        CarsClass test1 = new CarsClass();

       //Írja ki a képernyőre, hogy az n-edikként belépő jármű melyik város felé haladt! Ehhez
        //kérje be a felhasználótól az n értékét!
        int nr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hányadik belépő járműnek az útvonalára vagy kíváncsi?");
        nr = sc.nextInt();
        test1.nDriverCityFrom(nr);

        //Írja a képernyőre, hogy a Felső város irányába tartó utolsó két jármű hány másodperc kü-
        //lönbséggel érte el az útszakasz kezdetét!
        test1.lastTwoUpperCity();

        //Határozza meg óránként és irányonként, hogy hány jármű érte el a szakaszt! Soronként
        //egy-egy óra adatait írja a képernyőre! Az első érték az órát, a második érték az Alsó, a
        //harmadik a Felső város felől érkező járművek számát jelentse! A kiírásban csak azokat az
        //órákat jelenítse meg, amelyekben volt forgalom valamely irányban!

        test1.counterCityFrom();

        //A belépéskor mért értékek alapján határozza meg a 10 leggyorsabb járművet! Írassa ki a
        //képernyőre ezek belépési idejét, a várost (Alsó, illetve Felső), amely felől érkezett, és
        //
        //m/s egységben kifejezett sebességét egy tizedes pontossággal, sebességük szerinti csökke-
        //nő sorrendben! Ha több azonos sebességű járművet talál, bármelyiket megjelenítheti. So-
        //ronként egy jármű adatait jelenítse meg, és az egyes adatokat szóközzel tagolja! (A feladat
        //
        //megoldásakor figyeljen arra, hogy a következő feladatban az adatok eredeti sorrendjét
        //még fel kell használni!)

        test1.fastest10CarWithTime();

    }
}
