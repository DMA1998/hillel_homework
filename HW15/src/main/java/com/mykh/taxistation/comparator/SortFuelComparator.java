package com.mykh.taxistation.comparator;

import com.mykh.taxistation.models.Car;

import java.util.Comparator;

public class SortFuelComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getFuelConsumption(),car2.getFuelConsumption());
    }
}
