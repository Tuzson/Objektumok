package com.company;

public class PointClass {
    double posX;
    double posY;

    public PointClass(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public void printInfo(){
        System.out.println("X kordináta értéke: " + posX);
        System.out.println("Y kordináta értéke: " + posY);
        if (posX > 0 && posY > 0){
            System.out.println("A pont a kordinátarendszer jobb felső felében van");

        }else if (posX < 0 && posY> 0){
            System.out.println("A pont a kordinátarendszer bal felső felében van");
        }
        else if (posX > 0 && posY < 0){
            System.out.println("A pont a kordinátarendszer jobb alsó felében van");
        }
        else if (posX < 0 && posY < 0){
            System.out.println("A pont a kordinátarendszer bal alsó felében van");
        }
    }
    public double pointDistance(PointClass point){
      double result =  Math.sqrt(Math.pow((point.posX- this.posX)+ (point.posY + this.posY),2));
        return result;
    }
}
