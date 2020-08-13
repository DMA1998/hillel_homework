package com.mykh.triangles.utils;

import com.mykh.triangles.figure.triangle.ITriangle;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class TriangleUtils {

    public boolean isEquilateral(ITriangle triangle) {
        if (isRectangular(triangle)) {
            return false;
        }
        return (triangle.getA() == triangle.getB()) && (triangle.getB() == triangle.getC()) && (triangle.getC() == triangle.getA());
    }

    public boolean isAbility(ITriangle triangle) {
        return !isRectangular(triangle) && !isIsosceles(triangle) && !isEquilateral(triangle);
    }

    public boolean isRectangular(ITriangle triangle) {
        double a = triangle.calculateDistance(triangle.getPointA(), triangle.getPointB());
        double b = triangle.calculateDistance(triangle.getPointB(), triangle.getPointC());
        double c = triangle.calculateDistance(triangle.getPointC(), triangle.getPointA());
        double aSquare = pow(a, 2);
        double bSquare = pow(b, 2);
        double cSquare = round(pow(c, 2));
        return aSquare + bSquare == cSquare;
    }

    public boolean isIsosceles(ITriangle triangle) {
        double a = triangle.calculateDistance(triangle.getPointA(), triangle.getPointB());
        double b = triangle.calculateDistance(triangle.getPointB(), triangle.getPointC());
        double c = triangle.calculateDistance(triangle.getPointC(), triangle.getPointA());
        if (isEquilateral(triangle) || isRectangular(triangle)) {
            return false;
        }
        return (a == b) || (b == c) || (c == a);
    }
}
