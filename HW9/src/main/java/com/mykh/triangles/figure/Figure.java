package com.mykh.triangles.figure;

import static java.lang.Math.*;

public abstract class Figure {

    public double calculateDistance(Point A, Point B) {
        return sqrt(pow(A.getX() - B.getX(), 2) + pow(A.getY() - B.getY(), 2));
    }

    public double calculateDistanceRound(Point A, Point B) {
        return round(sqrt(pow(A.getX() - B.getX(), 2) + pow(A.getY() - B.getY(), 2)));
    }

}
