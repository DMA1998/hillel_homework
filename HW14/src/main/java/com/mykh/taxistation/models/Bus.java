package com.mykh.taxistation.models;

public class Bus extends Car {

    private int passengerSeats;

    public Bus(String model, String brand, int year, double fuelConsumption, double maxSpeed, double price, int passengerSeats) {
        super(model, brand, year, fuelConsumption, maxSpeed, price);
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerSeats=" + passengerSeats;
    }
}