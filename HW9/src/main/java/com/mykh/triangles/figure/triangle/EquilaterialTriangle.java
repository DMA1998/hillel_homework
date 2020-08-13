package com.mykh.triangles.figure.triangle;

import com.mykh.triangles.figure.Point;

public class EquilaterialTriangle extends Triangle implements ITriangle{

    public EquilaterialTriangle(Point A, Point B, Point C) {
        super(A, B, C);
    }


    @Override
    public double calculatePerimeter() {
        return Math.pow(calculateDistance(getPointA(),getPointB()),3);
    }
}
