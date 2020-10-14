package com.company;

public class CarStation {
    public static void main(String[] args) {
        Car_Class car1 = new Car_Class();
        Station_Class mol = new Station_Class();
        tankolás(car1,mol);
    }
    public static void tankolás (Car_Class car, Station_Class petrol){
        petrol.refillCar(car);
        car.carRefill(petrol);
        System.out.println(car.capacity);
        System.out.println(car.gasAmount);
        System.out.println(petrol.gasAmount);
    }
}
