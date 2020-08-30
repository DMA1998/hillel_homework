package com.mykh.carsproject.utils;

import com.mykh.carsproject.taxistation.car.Car;

public class ArraysUtils {

    public static Car[] increaseArrayAddCar(Car[] cars, Car car) {
        Car[] result = new Car[cars.length + 1];
        System.arraycopy(cars, 0, result, 0, cars.length);
        result[cars.length] = car;
        return result;
    }
}
