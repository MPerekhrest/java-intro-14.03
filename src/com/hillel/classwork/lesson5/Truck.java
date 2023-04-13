package com.hillel.classwork.lesson5;

public class Truck {
    public static void main(String[] args) {
        double volume = calculateVolume(16.5, 2.5, 4);
        System.out.println("volume=" + volume + "m^3");
        double totalWeight = calculateTotalWeight(volume, 58);
        System.out.println("totalWeight = " + totalWeight + " kg");
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateTotalWeight(double volume, double maxWeight) {
        return volume * maxWeight;
    }
}
