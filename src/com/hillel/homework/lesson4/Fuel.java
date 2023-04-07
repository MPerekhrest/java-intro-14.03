package com.hillel.homework.lesson4;

public class Fuel {
    public static void main(String[] args) {
        float consumption = calculateConsumption(25, 350);

        System.out.println("consumption = " + consumption + " l/100 km");

    }

    public static float calculateConsumption(float fuel, float distance) {

        return fuel / distance * 100;
    }

}
