public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car("Audi", "R8", 2014, 6, 250, 20000),
                new PickupTruck("Ford", "Raptor", 2010, 10, 180, 25000, 600),
                new Bus("Suzu Ataman", "A4205", 2008, 15, 130, 15000, 25),
                new Car("Toyota", "Corolla", 2008, 4, 190, 8000),
                new PickupTruck("Dodge", "Craiz", 2017, 17, 200, 35000, 500),
                new Bus("Icarus", "T3242", 2003, 10, 120, 7000, 20)};


        TaxiStation taxiStation = new TaxiStation();
        System.out.println("Sum of all cars: " + taxiStation.carsPrice(cars));
        taxiStation.sortByFuelConsumption(cars);
        printCars(cars);
        printCars(taxiStation.filterCarsBySpeed(cars, 190, 100));


    }

    private static void printCars(Car[] cars) {
        System.out.println("------------------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
