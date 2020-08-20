package com.mykh.models;

import java.util.Arrays;

import static com.mykh.utils.ArrayUtils.*;

public class FlowerShop {

    private final int BOUQUET_AMOUNT = 0;
    private Bouquet[] bouquets;

    public FlowerShop() {
        bouquets = new Bouquet[BOUQUET_AMOUNT];
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

    public void filterByStemLength(int min, int max) {

        for (Bouquet bouquet : bouquets) {
            for (Flower flower : bouquet.getFlowers())
                if (flower.getStemLength() >= min && flower.getStemLength() <= max) {
                    System.out.println(flower);
                }
        }
    }

    public void sortByDaysLife() {
        Flower temp;

        for (Bouquet bouq : bouquets) {
            for (int i = 0; i < bouq.getFlowers().length; i++) {
                for (int j = 1; j < bouq.getFlowers().length - i; j++) {
                    if (bouq.getFlowers()[j - 1].getLifeDays() > bouq.getFlowers()[j].getLifeDays()) {
                        temp = bouq.getFlowers()[j - 1];
                        bouq.getFlowers()[j - 1] = bouq.getFlowers()[j];
                        bouq.getFlowers()[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(bouq.getFlowers()));
        }
    }

    public double bouquetAllPrice() {
        double sum = 0;
        for (Bouquet bouquet : bouquets) {
            sum = sum + bouquet.totalPrice();
        }
        return sum;
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets = increaseBouquetArray(bouquets, bouquet);
    }

    public void addFlowerToBouquet(Flower flower) {
        for (Bouquet bouq : bouquets)
            bouq.addFlower(flower);
    }

    public void addAccessoryToBouquet(Accessory accessory) {
        for (Bouquet bouq : bouquets) {
            bouq.addAccessory(accessory);
        }
    }

    public void printBouquet() {
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
        }
    }

    @Override
    public String toString() {
        return "FlowerShop{" +
                "bouquets=" + Arrays.toString(bouquets) +
                '}';
    }
}
