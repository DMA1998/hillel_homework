package com.mykh.carsproject.runner;

import com.mykh.carsproject.input.InputAction;
import com.mykh.carsproject.taxistation.car.Car;

public class Runner {
    public static void main(String[] args) {
        InputAction ip = new InputAction();
        Car[] converted = ip.convertedCars();
        ip.readFile();
        ip.writeFile(converted);
    }
}










