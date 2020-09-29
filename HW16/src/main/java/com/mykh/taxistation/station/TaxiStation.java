package com.mykh.taxistation.station;

import com.mykh.taxistation.comparator.SortFuelComparator;
import com.mykh.taxistation.models.Car;

import java.util.List;

public class TaxiStation {

    public double calculatePrice(List<Car> list) {
        double totalPrice = list.stream().mapToDouble(car -> car.getPrice()).sum();

        return totalPrice;
    }

    public void sortFuel(List<Car> list) {
     list.stream().sorted(new SortFuelComparator()).forEach(System.out::println);
    }

    public void findCarsBySpeed(List<Car> list, int min, int max) {

        list.stream().filter(car -> car.getSpeed() >= min && car.getSpeed() <= max).forEach(System.out::println);
    }

}