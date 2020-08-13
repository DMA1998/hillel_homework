package com.mykh.triangles;
import com.mykh.triangles.figure.Point;
import com.mykh.triangles.figure.triangle.EquilaterialTriangle;
import com.mykh.triangles.figure.triangle.ITriangle;
import com.mykh.triangles.figure.triangle.IsoscelesTriangle;
import com.mykh.triangles.figure.triangle.RectangularTriangle;
import com.mykh.triangles.figure.triangle.Triangle;
import com.mykh.triangles.utils.TriangleUtils;

public class Runner {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new EquilaterialTriangle(new Point(0, 0), new Point(0.5, Math.sqrt(3) / 2), new Point(1, 0)),
                new EquilaterialTriangle(new Point(0, 0), new Point(1, Math.sqrt(3)), new Point(2, 0)),
                new IsoscelesTriangle(new Point(0, 0), new Point(4, 10), new Point(8, 0)),
                new IsoscelesTriangle(new Point(0, 0), new Point(8, 20), new Point(16, 0)),
                new RectangularTriangle(new Point(0, 1), new Point(0, 0), new Point(1, 0)),
                new RectangularTriangle(new Point(0, 2), new Point(0, 0), new Point(2, 0)),
                new Triangle(new Point(0, 0), new Point(0, 3), new Point(2, 1)),
                new Triangle(new Point(4, 3), new Point(15, 8), new Point(15, 3))
        };
        TriangleProcessor triangleProcessor = new TriangleProcessor();
        TriangleUtils utils = new TriangleUtils();
        System.out.println("Equilateral triangles: " + triangleProcessor.count(triangles, utils::isEquilateral));
        ITriangle[] equilateralTriangles = triangleProcessor.filterBy(triangles, utils::isEquilateral);
        System.out.println("Min. equilateral triangles is:\n" + triangleProcessor.countMinTriangle(equilateralTriangles));
        System.out.println("Max. equilateral triangles is:\n" + triangleProcessor.countMaxTriangle(equilateralTriangles));
        System.out.println("\nIsosceles triangles: " + triangleProcessor.count(triangles, utils::isIsosceles));
        ITriangle[] isoscelesTriangles = triangleProcessor.filterBy(triangles, utils::isIsosceles);
        System.out.println("Min. isosceles triangles is:\n" + triangleProcessor.countMinTriangle(isoscelesTriangles));
        System.out.println("Max. isosceles triangles is:\n" + triangleProcessor.countMaxTriangle(isoscelesTriangles));
        System.out.println("\nRectangular triangles: " + triangleProcessor.count(triangles, utils::isRectangular));
        ITriangle[] rectangularTriangles = triangleProcessor.filterBy(triangles, utils::isRectangular);
        System.out.println("Min. rectangular triangles is:\n" + triangleProcessor.countMinTriangle(rectangularTriangles));
        System.out.println("Max. rectangular triangles is:\n" + triangleProcessor.countMaxTriangle(rectangularTriangles));
        System.out.println("\nAbility triangles: " + triangleProcessor.count(triangles, utils::isAbility));
        ITriangle[] abilityTriangles = triangleProcessor.filterBy(triangles, utils::isAbility);
        System.out.println("Min. ability triangles is:\n" + triangleProcessor.countMinTriangle(abilityTriangles));
        System.out.println("Max. ability triangles is:\n" + triangleProcessor.countMaxTriangle(abilityTriangles));
    }
}

