package com.mykh.console;

import com.mykh.exception.StemException;
import com.mykh.models.Accessory;
import com.mykh.models.Bouquet;
import com.mykh.models.Flower;
import com.mykh.models.FlowerShop;

import java.util.Scanner;

public class ConsoleFlowersWorker {

    private Scanner scanner;
    private FlowerShop flowerShop;

    public ConsoleFlowersWorker(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        ConsoleFlowersWorker consoleFlowersWorker = new ConsoleFlowersWorker(flowerShop);
        consoleFlowersWorker.start();
        consoleFlowersWorker.stop();
    }

    public void start() {
        FlowerShop flowerShop = new FlowerShop();
        int pick = 0;

        do {
            System.out.println("1. Create bouquet");
            System.out.println("2. Bouquets operations");
            System.out.println("3. Print current bouquets");
            System.out.println("0. Exit");

            pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    flowerShop.addBouquet(createBouquet());
                    break;
                case 2:
                    try {
                        bouquetChoosing(flowerShop);
                    } catch (StemException e) {
                        System.out.println("Invalid input.Number should not be negative.\n");
                    }
                    break;
                case 3:
                    flowerShop.printBouquet();
                    break;
                case 0:
                    System.out.println("  ");
                    break;
                default:
                    System.out.println("Incorrect number. Try again\n");
            }
        }
        while (pick != 0);
    }

    private Bouquet createBouquet() {
        Bouquet bouquet = new Bouquet();
        int pick = 0;

        do {
            System.out.println("1. Create flowers");
            System.out.println("2. Create accessories");
            System.out.println("0. Back");

            pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    addFlowerToBouquet(bouquet);
                    break;
                case 2:
                    addAccessoryToBouquet(bouquet);
                    break;
                case 0:
                    System.out.println("Bouquet price is: " + bouquet.totalPrice() + "$\n");
                    break;
                default:
                    System.out.println("Incorrect number. Try again\n");
            }
        }
        while (pick != 0);
        return bouquet;
    }

    private void addAccessoryToBouquet(Bouquet bouquet) {
        String name = null;
        double price = 0;
        int pick = 0;

        do {
            System.out.println("1. New accessory");
            System.out.println("0. Back");

            pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    System.out.println("Accessory name: ");
                    name = scanner.next();
                    System.out.println("Price:");
                    price = scanner.nextDouble();

                    bouquet.addAccessory(new Accessory(name, price));
                    break;

                case 0:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Wrong number!");
            }
        } while (pick != 0);
    }

    private void addFlowerToBouquet(Bouquet bouquet) {
        String name = null;
        double price = 0;
        double stemLength = 0;
        int lifeDays = 0;
        int pick = 0;

        do {
            System.out.println("1. New flower");
            System.out.println("0. Back");

            pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    System.out.println("Flower name: ");
                    name = scanner.next();
                        System.out.println("Price:");
                        price = scanner.nextDouble();
                        System.out.println("Days of life: ");
                        lifeDays = scanner.nextInt();
                        System.out.println("Length of stem:");
                        stemLength = scanner.nextDouble();
                    bouquet.addFlower(new Flower(name, price, lifeDays, stemLength));
                    break;
                case 0:
                    System.out.print("");
                    break;
                default:
                    System.out.println("Wrong number!");

            }
        } while (pick != 0);
    }

    private void bouquetChoosing(FlowerShop flowerShop) throws StemException {
        String name = null;
        double price = 0;
        double stemLength = 0;
        int lifeDays = 0;
        int min = 0;
        int max = 0;
        int pick = 0;

        do {
            System.out.println("1. Sort flowers by days of life");
            System.out.println("2. Find flowers by stem length");
            System.out.println("3. Bouquet price");
            System.out.println("4. Add flower");
            System.out.println("5. Add accessory");
            System.out.println("0. Back");

            pick = scanner.nextInt();

            switch (pick) {
                case 1:
                    flowerShop.sortByDaysLife();
                    break;
                case 2:
                    System.out.println("Enter min. length:");
                    min = checkValue(scanner.nextInt());
                    System.out.println("Enter max. length:");
                    max = checkValue(scanner.nextInt());
                    flowerShop.filterByStemLength(min, max);
                    break;
                case 3:
                    System.out.println("Total bouquet price is " + flowerShop.bouquetAllPrice() + "$\n");
                    break;
                case 4:
                    System.out.println("Flower name: ");
                    name = scanner.next();
                        System.out.println("Price:");
                        price = scanner.nextDouble();
                        System.out.println("Days of life: ");
                        lifeDays = scanner.nextInt();
                        System.out.println("Length of stem:");
                        stemLength = scanner.nextDouble();
                        flowerShop.addFlowerToBouquet(new Flower(name, price, lifeDays, stemLength));
                    break;
                case 5:
                    System.out.println("Accessory name: ");
                    name = scanner.next();
                    System.out.println("Price:");
                    price = scanner.nextDouble();
                    flowerShop.addAccessoryToBouquet(new Accessory(name,price));
                case 0:
                    System.out.print("");
                    break;
                default:
                    System.out.println("Invalid number.Try again:\n");
            }
        } while (pick != 0);
    }

    private int checkValue(int number) throws StemException {
        if (number < 0) {
            throw new StemException("Not valid number: " + number);
        }
        return number;
    }

    private void stop() {
        scanner.close();
    }
}
