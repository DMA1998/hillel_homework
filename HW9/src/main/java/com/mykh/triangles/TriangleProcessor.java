package com.mykh.triangles;

import com.mykh.triangles.figure.triangle.ITriangle;

import java.util.function.Function;

class TriangleProcessor {

    ITriangle[] filterBy(ITriangle[] triangles, Function<ITriangle, Boolean> function) {
        ITriangle[] result = new ITriangle[count(triangles, function)];
        int counter = 0;
        for (ITriangle triangle : triangles) {
            if (function.apply(triangle)) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    int count(ITriangle[] triangles, Function<ITriangle, Boolean> function) {
        int result = 0;
        for (ITriangle triangle : triangles) {
            if (function.apply(triangle)) {
                result++;
            }
        }
        return result;
    }

    ITriangle countMinTriangle(ITriangle[] triangles) {
        ITriangle maxTriangle = countMaxTriangle(triangles);
        double minSquare = maxTriangle.calculateArea();
        double minPerimeter = maxTriangle.calculatePerimeter();
        ITriangle result = null;
        for (ITriangle triangle : triangles) {
            if (triangle.calculateArea() <= minSquare && triangle.calculatePerimeter() <= minPerimeter) {
                minSquare = triangle.calculateArea();
                minPerimeter = triangle.calculatePerimeter();
                result = triangle;
            }
        }
        return result;
    }

    ITriangle countMaxTriangle(ITriangle[] triangles) {
        double maxSquare = 0;
        double maxPerimeter = 0;
        ITriangle result = null;
        for (ITriangle triangle : triangles) {
            if (triangle.calculateArea() >= maxSquare && triangle.calculatePerimeter() >= maxPerimeter) {
                maxSquare = triangle.calculateArea();
                maxPerimeter = triangle.calculatePerimeter();
                result = triangle;
            }
        }
        return result;
    }

}