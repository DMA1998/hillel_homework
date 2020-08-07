public class TriangleProcessor {

    public Triangle[] filterByEquilateral(Triangle[] triangles) {
        Triangle[] result = new Triangle[countEquilateralAmount(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isEquilateral()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int countEquilateralAmount(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isEquilateral()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] filterByIsosceles(Triangle[] triangles) {
        Triangle[] result = new Triangle[countIsoscelesAmount(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isIsosceles()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int countIsoscelesAmount(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isIsosceles()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] filterByRectangular(Triangle[] triangles) {
        Triangle[] result = new Triangle[countRectangularAmount(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isRectangular()) {
                result[counter] = triangle;
                counter++;
            }
        }
        return result;
    }

    public int countRectangularAmount(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (triangle.isRectangular()) {
                result++;
            }
        }
        return result;
    }

    public Triangle[] filterByAbility(Triangle[] triangles) {
        Triangle[] result = new Triangle[countAbilityAmount(triangles)];
        int counter = 0;
        for (Triangle triangle : triangles) {
            if (!triangle.isRectangular() && !triangle.isIsosceles() && !triangle.isEquilateral()) {
                result[counter] = triangle;
                counter++;

            }
        }
        return result;
    }

    public int countAbilityAmount(Triangle[] triangles) {
        int result = 0;
        for (Triangle triangle : triangles) {
            if (!triangle.isRectangular() && !triangle.isIsosceles() && !triangle.isEquilateral()) {
                result++;
            }
        }
        return result;
    }

    public Triangle countMinTriangle(Triangle[] triangles) {
        Triangle maxTriangle = countMaxTriangle(triangles);
        double minSquare = maxTriangle.calculateArea();
        double minPerimeter = maxTriangle.calculatePerimeter();
        Triangle result = null;

        for (Triangle triangle : triangles) {
            if (triangle.calculateArea() <= minSquare && triangle.calculatePerimeter() <= minPerimeter) {
                minSquare = triangle.calculateArea();
                minPerimeter = triangle.calculatePerimeter();
                result = triangle;
            }
        }
        return result;
    }

    public Triangle countMaxTriangle(Triangle[] triangles) {
        double maxSquare = 0;
        double maxPerimeter = 0;
        Triangle result = null;
        for (Triangle triangle : triangles) {
            if (triangle.calculateArea() >= maxSquare && triangle.calculatePerimeter() >= maxPerimeter) {
                maxSquare = triangle.calculateArea();
                maxPerimeter = triangle.calculatePerimeter();
                result = triangle;
            }
        }
        return result;
    }

}

