package com.company;

public class DominoClass {
    public final int left;
    public final int right;

    public DominoClass(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public int left (){
        return left;
    }
    public int right(){
        return right;
    }

    @Override
    public String toString() {
        return "DominoClass{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
