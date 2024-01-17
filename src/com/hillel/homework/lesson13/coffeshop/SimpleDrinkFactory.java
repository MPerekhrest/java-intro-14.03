package com.hillel.homework.lesson13.coffeshop;
public class SimpleDrinkFactory {
    public Beverage create(DrinkType type) {

        return switch (type) {
            case AMERICANO-> new Americano();
            case LATTE -> new Latte();
            case CAPPUCCINO-> new Cappuccino();
            case TEA -> new Tea();
        };
    }
}