package com.mykh.triangles.figure.triangle;

import com.mykh.triangles.figure.Point;

public interface ITriangle {

    double calculateDistance(Point A, Point B);

    double calculateArea();

    double calculatePerimeter();

    Point getPointA();

    Point getPointB();

    Point getPointC();

    public double getA();

    public double getB();

    public double getC();
}
