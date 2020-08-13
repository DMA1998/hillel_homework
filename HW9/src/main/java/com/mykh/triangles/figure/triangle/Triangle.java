package com.mykh.triangles.figure.triangle;

import com.mykh.triangles.figure.Figure;
import com.mykh.triangles.figure.Point;

import static java.lang.Math.*;

public class Triangle extends Figure implements ITriangle {

    private Point A;
    private Point B;
    private Point C;
    private double a;
    private double b;
    private double c;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        initSides();
    }

    @Override
    public Point getPointA() {
        return A;
    }

    @Override
    public Point getPointB() {
        return B;
    }

    @Override
    public Point getPointC() {
        return C;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public double getC() {
        return c;
    }

    @Override
    public double calculateArea() {
        return geroneSquare();
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    private void initSides() {
        this.a = calculateDistanceRound(A, B);
        this.b = calculateDistanceRound(B, C);
        this.c = calculateDistanceRound(C, A);
    }

    private double geroneSquare() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " \n" +
                A.toString() + "\n" +
                B.toString() + "\n" +
                C.toString() + "\n";
    }
}

