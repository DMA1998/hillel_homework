package com.mykh.carsproject.taxistation.car;

public class PickupTruck extends Car {

    private int liftingCapacity;

    public PickupTruck(String brand, String model, int year, int fuelConsumption, int maxSpeed, int price, int liftingCapacity) {
        super(brand, model, year, fuelConsumption, maxSpeed, price);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "," + liftingCapacity + ";";
    }
}