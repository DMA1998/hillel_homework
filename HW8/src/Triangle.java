public class Triangle extends Figure {

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

    public void initSides() {

        this.a = calculateDistanceRound(A, B);
        this.b = calculateDistanceRound(B, C);
        this.c = calculateDistanceRound(C, A);
    }

    public double calculateArea() {
        return geroneSquare();
    }

    private double geroneSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    public double calculatePerimeter() {
        if (isEquilateral()) {
            return Math.pow(calculateDistance(A, B), 3);
        } else {
            return a + b + c;
        }
    }

    public boolean isIsosceles() {
        double a = calculateDistance(A, B);
        double b = calculateDistance(B, C);
        double c = calculateDistance(C, A);

        if (isEquilateral() || isRectangular()) {
            return false;
        }
        return (a == b) || (b == c) || (c == a);
    }

    public boolean isEquilateral() {
        if (isRectangular()) {
            return false;
        }
        return (a == b) && (b == c) && (c == a);
    }

    public boolean isRectangular() {
        double a = calculateDistance(A, B);
        double b = calculateDistance(B, C);
        double c = calculateDistance(C, A);
        double aSquare = Math.pow(a, 2);
        double bSquare = Math.pow(b, 2);
        double cSquare = Math.round(Math.pow(c, 2));
        return aSquare + bSquare == cSquare;
    }

    @Override
    public String toString() {
        return "Triangle: \n" +
                A.toString() + "\n" +
                B.toString() + "\n" +
                C.toString() + "\n" +
                "Equilarerial: " + isEquilateral() +
                "\nIsosceles: " + isIsosceles() +
                "\n" + "Rectangular: " + isRectangular();
    }
}

