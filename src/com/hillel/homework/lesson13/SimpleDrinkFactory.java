package com.hillel.homework.lesson13;

import com.hillel.homework.lesson13.drinks.*;

public class SimpleDrinkFactory {
    public Beverage create(String type) {

        return switch (type) {
            case "1" -> new Americano();
            case "2" -> new Latte();
            case "3" -> new Cappuccino();
            case "4" -> new Tea();
            default -> null;
        };
    }
}