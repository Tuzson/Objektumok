package com.company;

public class PointMain {
    public static void main(String[] args) {
        PointClass point1 = new PointClass(1,1);
        PointClass point2 = new PointClass(8,13);

        point1.printInfo();
        point2.printInfo();

        System.out.println(point1.pointDistance(point2));
        CircleClass circle1 = new CircleClass(2,point1);
        CircleClass circle2 = new CircleClass(3,point2);
        System.out.println("Kör metszéspontja:" + circle1.hasIntersection(circle2));

        SquareClass square1 = new SquareClass(15,point1);
        SquareClass square2 = new SquareClass(4,point2);
        System.out.println("Négyzet metszéspontja: " + square1.hasIntersection(square2));
        System.out.println("Négyzet metszéspontja: " + square2.hasIntersection(square1));
//        System.out.println(square1.contains(point2));
        System.out.println(square1.insideCircle());
    }
}
