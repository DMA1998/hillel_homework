package com.mykh.models;

import java.util.Arrays;

import static com.mykh.utils.ArrayUtils.*;

public class Bouquet {

    private final int FLOWERS_AMOUNT = 0;
    private final int ACCESSORIES_AMOUNT = 0;

    private Flower[] flowers;
    private Accessory[] accessories;

    public Bouquet() {
        flowers = new Flower[FLOWERS_AMOUNT];
        accessories = new Accessory[ACCESSORIES_AMOUNT];
    }

    public void addFlower(Flower flower) {
        this.flowers = increaseFlowerArray(flowers, flower);
    }

    public void addAccessory(Accessory accessory) {
        this.accessories = increaseAccessoryArray(accessories, accessory);
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    public double totalPrice() {
        double sum = 0;

        for (Accessory accessory : accessories) {
            sum = sum + accessory.getPrice();
        }

        for (Flower flower : flowers) {
            sum = sum + flower.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Flowers:\n" + Arrays.toString(flowers) +
                "\nAccessories:\n" + Arrays.toString(accessories);
    }
}





