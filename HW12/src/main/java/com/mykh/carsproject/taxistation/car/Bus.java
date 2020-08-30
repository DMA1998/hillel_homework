package com.mykh.carsproject.taxistation.car;

public class Bus extends Car {

    private int passengerSeats;

    public Bus(String brand, String model, int year, int fuelConsumption, int maxSpeed, int price, int passengerSeats) {
        super(brand, model, year, fuelConsumption, maxSpeed, price);
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return super.toString() + "," + passengerSeats;
    }
}