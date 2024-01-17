package com.hillel.homework.lesson13.coffeshop;

public abstract class Beverage {
    protected double price;

    public String prepare() {
        return "Making " + this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + price + " PLN";
    }

    public String order() {
        return this.getClass().getSimpleName() + this.setSpace() + price + "PLN";
    }

    public String setSpace() {
        int full = 24;
        int nameLength = this.getClass().getSimpleName().length();
        return " ".repeat(Math.max(0, (full - nameLength)));
    }

    public double getPrice() {
        return this.price;
    }

}