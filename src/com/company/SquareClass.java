package com.company;

public class SquareClass {
    double sideLength;
    double diagonal;
    PointClass leftDown;

    public SquareClass(double sideLength, PointClass leftDown) {
        this.sideLength = sideLength;
        this.leftDown = leftDown;

    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getCircumference() {
        return 4 * sideLength;
    }

    public boolean hasIntersection(SquareClass other) {
        double distance = this.leftDown.pointDistance(other.leftDown);

        if ((other.leftDown.posX + other.sideLength) >= this.leftDown.posX && other.leftDown.posY <= (this.leftDown.posY + sideLength) && (other.leftDown.posY + other.sideLength) >= this.leftDown.posY) {
            return true;
        }
        return false;
    }

    public boolean contains(PointClass p) {

        if (p.posX >= leftDown.posX && p.posX <= (leftDown.posX + sideLength) && p.posY >= leftDown.posY && p.posY <= (leftDown.posY + sideLength)) {
            return true;
        }
        return false;
    }
}

