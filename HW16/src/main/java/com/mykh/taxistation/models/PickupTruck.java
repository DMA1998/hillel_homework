package com.mykh.taxistation.models;

import com.mykh.taxistation.models.Car;

public class PickupTruck extends Car {

    private int liftingCapacity;


    public PickupTruck(String model, String brand, int year, double fuelConsumption, double maxSpeed, double price, int liftingCapacity) {
        super(model, brand, year, fuelConsumption, maxSpeed, price);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", liftingCapacity=" + liftingCapacity;
    }
}