public abstract class Figure {

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public double calculateDistance(Point A, Point B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }

    public double calculateDistanceRound(Point A, Point B) {
        return Math.round(Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2)));
    }

}
