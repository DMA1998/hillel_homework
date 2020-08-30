package com.mykh.carsproject.input;

import com.mykh.carsproject.taxistation.car.Bus;
import com.mykh.carsproject.taxistation.car.Car;
import com.mykh.carsproject.taxistation.car.PickupTruck;
import com.mykh.carsproject.utils.ArraysUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class InputAction {

    //todo Pull up string value from file.
    public  String readFile() {
        String result = null;
        try (FileInputStream fis = new FileInputStream(new File("D:\\Cars.txt"))) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            result = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    //todo convert string value into Car obj
    public  Car[] convertedCars() {
        Car[] result = new Car[0];
        String[] carsSplit;
        String str = readFile();
        carsSplit = str.split(";\r\n");
        for (String carSplit : carsSplit) {
            String[] propertiesSplit = carSplit.split(",");

            Car car = null;

            if (propertiesSplit[0].equals("Pickup truck")) {
                car = new PickupTruck(propertiesSplit[1], propertiesSplit[2], Integer.parseInt(propertiesSplit[3]),
                        Integer.parseInt(propertiesSplit[4]), Integer.parseInt(propertiesSplit[5]), Integer.parseInt(propertiesSplit[6]),
                        Integer.parseInt(propertiesSplit[7]));
            } else if (propertiesSplit[0].equals("Bus")) {
                car = new Bus(propertiesSplit[1], propertiesSplit[2], Integer.parseInt(propertiesSplit[3]),
                        Integer.parseInt(propertiesSplit[4]), Integer.parseInt(propertiesSplit[5]), Integer.parseInt(propertiesSplit[6]),
                        Integer.parseInt(propertiesSplit[7]));
            }
            result = ArraysUtils.increaseArrayAddCar(result, car);

        }
        return result;
    }

    // todo add converted cars to new file
    public void writeFile(Car[] cars) {
        String result = null;
        try (FileWriter fileWriter = new FileWriter("D:\\Written.txt", false)) {
            for (int i = 0; i < cars.length; i++) {
                result = cars[i].toString();
                fileWriter.write(result);
                fileWriter.write(System.lineSeparator());
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
