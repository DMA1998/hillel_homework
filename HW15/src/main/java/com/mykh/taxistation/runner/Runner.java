package com.mykh.taxistation.runner;

import com.mykh.taxistation.models.Bus;
import com.mykh.taxistation.models.Car;
import com.mykh.taxistation.models.PickupTruck;
import com.mykh.taxistation.station.TaxiStation;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "R8", 2014, 6, 250, 20000));
        list.add(new PickupTruck("Ford", "Raptor", 2010, 10, 180, 25000, 600));
        list.add(new Bus("Suzu Ataman", "A4205", 2008, 15, 130, 15000, 25));
        list.add(new PickupTruck("Dodge", "Craiz", 2017, 17, 200, 35000, 500));
        list.add(new Bus("Icarus", "T3242", 2003, 10, 120, 7000, 20));

        TaxiStation tx = new TaxiStation();
        tx.sortFuelLambda(list);
        tx.sortFuelInterface(list);
        tx.sortFuelLink(list);

        tx.filterCarsBySpeed(list,222,1);

        System.out.println(list);


    }
}

