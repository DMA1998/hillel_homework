package com.mykh.taxistation.runner;

import com.mykh.taxistation.comparator.SortFuelComparator;
import com.mykh.taxistation.models.Bus;
import com.mykh.taxistation.models.Car;
import com.mykh.taxistation.models.PickupTruck;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car("Audi", "R8", 2014, 6, 250, 20000),
                new PickupTruck("Ford", "Raptor", 2010, 10, 180, 25000, 600),
                new Bus("Suzu Ataman", "A4205", 2008, 15, 130, 15000, 25),
                new Car("Toyota", "Corolla", 2008, 4, 190, 8000),
                new PickupTruck("Dodge", "Craiz", 2017, 17, 200, 35000, 500),
                new Bus("Icarus", "T3242", 2003, 10, 120, 7000, 20)};

        System.out.println("Test 1.Interface implementation");
        Arrays.sort(cars,new SortFuelComparator());
        printCars(cars);

        System.out.println("Test 2.Lambda's implementation");
        Arrays.sort(cars, (car1, car2) -> {
                    if (car1.getFuelConsumption() > car2.getFuelConsumption())
                        return 1;
                    else if (car1.getFuelConsumption() < car2.getFuelConsumption())
                        return -1;
                    else
                        return 0;
                }
        );
        printCars(cars);

        System.out.println("Test 3.Link to method");
        Arrays.sort(cars, Comparator.comparingDouble(Car::getFuelConsumption));
        printCars(cars);

    }

    private static void printCars(Car[] cars) {
        System.out.println("------------------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
