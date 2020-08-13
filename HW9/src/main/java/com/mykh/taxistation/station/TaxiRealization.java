package com.mykh.taxistation.station;

import com.mykh.taxistation.transport.Car;

public class TaxiRealization implements TaxiStation {
    @Override
    public double carsPrice(Car[] cars) {
        double sum = 0;

        for (Car car : cars) {
            sum = sum + car.getPrice();
        }
        return sum;
    }

    @Override
    public void sortByFuelConsumption(Car[] cars) {
        bubbleSort(cars);
    }

    @Override
    public Car[] filterCarsBySpeed(Car[] cars, int max, int min) {
        int counter = 0;
        Car[] result = new Car[counter];
        for (Car car : cars) {
            if (car.getSpeed() >= min && car.getSpeed() <= max) {
                result = increaseCars(result);
                result[counter] = car;
                counter++;
            }
        }
        return result;
    }

    @Override
    public void bubbleSort(Car[] cars) {
        int n = cars.length;
        Car temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cars[j - 1].getFuelConsumption() > cars[j].getFuelConsumption()) {
                    temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }

            }
        }
    }

    @Override
    public Car[] increaseCars(Car[] cars) {
        Car[] result = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            result[i] = cars[i];
        }
        return result;
    }
}
