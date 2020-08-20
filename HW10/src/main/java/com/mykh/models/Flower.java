package com.mykh.models;

public class Flower {

    private String name;
    private double price;
    private int lifeDays;
    private double stemLength;

    public Flower(String name, double price, int lifeDays, double stemLength) {
        this.name = name;
        this.price = price;
        this.lifeDays = lifeDays;
        this.stemLength = stemLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLifeDays() {
        return lifeDays;
    }

    public void setLifeDays(int lifeDays) {
        this.lifeDays = lifeDays;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return
                "name:" + name + '\'' +
                ", price:" + price + "$" +
                ", lifeDays:" + lifeDays +
                ", stemLength:" + stemLength + "cm.\n";
    }
}
