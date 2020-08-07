public class Runner {
    public static void main(String[] args) {
        Triangle[] triangles = {
                new Triangle(new Point(0, 0), new Point(0.5, Math.sqrt(3) / 2), new Point(1, 0)),
                new Triangle(new Point(0, 0), new Point(1, Math.sqrt(3)), new Point(2, 0)),
                new Triangle(new Point(0, 0), new Point(4, 10), new Point(8, 0)),
                new Triangle(new Point(0, 0), new Point(8, 20), new Point(16, 0)),
                new Triangle(new Point(0, 1), new Point(0, 0), new Point(1, 0)),
                new Triangle(new Point(0, 2), new Point(0, 0), new Point(2, 0)),
                new Triangle(new Point(0, 0), new Point(0, 3), new Point(2, 1)),
                new Triangle(new Point(4, 3), new Point(15, 8), new Point(15, 3))
        };


        TriangleProcessor triangleProcessor = new TriangleProcessor();

        System.out.println("Equilaterial triangles: " + triangleProcessor.countEquilateralAmount(triangles));
        Triangle[] equilateralTriangles = triangleProcessor.filterByEquilateral(triangles);
        System.out.println("Min. equilaterial triangles is:\n" + triangleProcessor.countMinTriangle(equilateralTriangles));
        System.out.println("Max. equilaterial triangles is:\n" + triangleProcessor.countMaxTriangle(equilateralTriangles));

        System.out.println("\nIsosceles triangles: " + triangleProcessor.countIsoscelesAmount(triangles));
        Triangle[] isoscelesTriangles = triangleProcessor.filterByIsosceles(triangles);
        System.out.println("Min. isosceles triangles is:\n" + triangleProcessor.countMinTriangle(isoscelesTriangles));
        System.out.println("Max. isosceles triangles is:\n" + triangleProcessor.countMaxTriangle(isoscelesTriangles));

        System.out.println("\nRectangular triangles: " + triangleProcessor.countRectangularAmount(triangles));
        Triangle[] rectangularTriangles = triangleProcessor.filterByRectangular(triangles);
        System.out.println("Min. rectangular triangles is:\n" + triangleProcessor.countMinTriangle(rectangularTriangles));
        System.out.println("Max. rectangular triangles is:\n" + triangleProcessor.countMaxTriangle(rectangularTriangles));

        System.out.println("\nAbility triangles: " + triangleProcessor.countAbilityAmount(triangles));
        Triangle[] abilityTriangles = triangleProcessor.filterByAbility(triangles);
        System.out.println("Min. ability triangles is:\n" + triangleProcessor.countMinTriangle(abilityTriangles));
        System.out.println("Max. ability triangles is:\n" + triangleProcessor.countMaxTriangle(abilityTriangles));
    }
}

