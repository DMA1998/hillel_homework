package com.mykh.carsproject.taxistation.car;

public class Car {

    private String model;
    private String brand;
    private int year;
    private int fuelConsumption;
    private int maxSpeed;
    private int price;

    public Car(String brand, String model, int year, int fuelConsumption, int maxSpeed, int price) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "," + brand +
                "," + model +
                "," + year +
                "," + fuelConsumption +
                "," + maxSpeed +
                "," + price;
    }
}