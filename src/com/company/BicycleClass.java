package com.company;

public class BicycleClass {
 private final int frontWheelGear = 60;
  private double wheelSize;
   private int[] rearWheelGear;
   private int gear;

    public BicycleClass(double wheelSize){
        this.wheelSize = wheelSize;
       rearWheelGear= new int[] {40,25,20,15,10,5};
    }

    public void setGear (int inGear){
        gear = inGear-1;
    }
    public double getSpeed(double revPerSec){
        double result =(revPerSec * ((double) frontWheelGear / rearWheelGear[gear]) * this.wheelSize * Math.PI *3.6);
        System.out.println(result);
       return result;
    }
    public double getRevPerSec (double speed){
        return (speed / 3.6) / (this.wheelSize * Math.PI) / ((double) frontWheelGear / rearWheelGear[gear]);
    }
}
