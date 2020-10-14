package com.company;

import java.util.Arrays;

public class Dominos {
    public static DominoClass domino1 = new DominoClass(5, 2);
    public static DominoClass domino2 = new DominoClass(4, 6);
    public static DominoClass domino3 = new DominoClass(1, 5);
    public static DominoClass domino4 = new DominoClass(6, 7);
    public static DominoClass domino5 = new DominoClass(2, 4);
    public static DominoClass domino6 = new DominoClass(7, 1);


    public static void main(String[] args) {

        DominoClass[] dominosArray = new DominoClass[]{domino1,domino2,domino3,domino4,domino5,domino6};
        for (int i = 0; i < dominosArray.length; i++) {
            dominosArray[i].left();
            dominosArray[i].right();
        }
        sort(dominosArray);
        for (int i = 0; i < dominosArray.length; i++) {
            System.out.println(dominosArray[i].toString());

        }
    }
    public static void sort (DominoClass[] dominos){
        DominoClass seged;
        for (int i = 0; i < dominos.length; i++) {
            for (int j = 1; j < dominos.length; j++) {
              if (dominos[i].right() == dominos[j].left()){
                  seged = dominos[i+1];
                  dominos[i+1] = dominos[j];
                  dominos[j]= seged;
              }
            }
        }

    }
}