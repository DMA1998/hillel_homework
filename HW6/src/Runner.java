public class Runner {

    public static void main(String[] args) {

        System.out.println("Cars info:\n");

        Car[] cars = {new Car(1, "Toyota", "Corolla", 2015,
                "white", 15000, "AA5532AE"),
                new Car(2, "Lexus", "LS500", 2011,
                        "black", 35000, "AA0007AA"),
                new Car(3, "Audi", "R8", 2015,
                        "yellow", 27000, "AX4235AC"),
                new Car(4, "Toyota", "Camry", 2011,
                        "black", 13000, "AX5412AH"),
                new Car(5, "Toyota", "Corolla", 2011,
                        "white", 10000, "AX4312AM")};


        CarProcessor proc = new CarProcessor(null);

        proc.showCarsBrand("dasdasda");

        System.out.println("List of all cars: ");
        proc.printCars(cars);

        System.out.println("\nList of cars by brand: ");
        proc.showCarsBrand(cars, "Toyota");

        System.out.println("\nList of cars by exploitation years: ");
        proc.showCarsYear(cars, "Corolla", 4);

        System.out.println("\nList of cars by price: ");
        proc.showCarsPrice(cars, 2011, 12900);





    }


}
