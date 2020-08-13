package com.mykh.taxistation.station;

import com.mykh.taxistation.transport.Car;

public interface TaxiStation  {

    double carsPrice(Car[] cars);

    public void sortByFuelConsumption(Car[] cars);

    public Car[] filterCarsBySpeed(Car[] cars, int max, int min);

    void bubbleSort(Car[] cars);

    Car[] increaseCars(Car[] cars);
}
