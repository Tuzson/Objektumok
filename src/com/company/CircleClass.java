package com.company;

public class CircleClass {
    double radius;
    PointClass center;

    public CircleClass(double radius,PointClass center){
        this.radius = radius;
        this.center = center;
    }
    public double getArea (){
        double area = (Math.pow(this.radius,2) * Math.PI);
        return area;
    }
    public double getCircumference(){
        double circumference = (2 * this.radius) * Math.PI;
        return circumference;
    }
    public boolean hasIntersection(CircleClass other){
        double pointDistance = this.center.pointDistance(other.center);
        if ((this.radius + other.radius) > pointDistance){
            return true;
        }return false;
    }
}
