package com.mykh.taxistation.station;

import com.mykh.taxistation.comparator.SortFuelComparator;
import com.mykh.taxistation.models.Car;

import java.util.Comparator;
import java.util.List;

public class TaxiStation {

    public void sortFuelInterface(List<Car> list) {
        list.sort(new SortFuelComparator());
    }

    public void sortFuelLambda(List<Car> list) {
        list.sort((car1, car2) -> {
                    if (car1.getFuelConsumption() > car2.getFuelConsumption())
                        return 1;
                    else if (car1.getFuelConsumption() < car2.getFuelConsumption())
                        return -1;
                    else
                        return 0;
                }
        );
    }

    public void sortFuelLink(List<Car> list) {
        list.sort(Comparator.comparingDouble(Car::getFuelConsumption));
    }

    public double carsPrice(List<Car> list) {
        double sum = 0;

        for (Car car : list) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    public void filterCarsBySpeed(List<Car> list, int max, int min) {
        for (Car car : list) {
            if (car.getSpeed() >= min && car.getSpeed() <= max) {
                System.out.println(car);
            }
        }
    }

}
