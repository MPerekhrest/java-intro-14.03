package com.hillel.homework.lesson4;

public class Animals {
    public static void main(String[] args) {

        int cat = calculateEat(8, 3, 50, 30);
        System.out.println("how much food is needed for cats in a month in grams: " + cat);
        int dog = calculateEat(24, 3, 50, 30);
        System.out.println("how much food is needed for dogs in a month in grams: " + dog);
        System.out.println("How much money do you need per month to run a shelter in dollars: " + ((cat + dog) * 2));

    }

    public static int calculateEat(int animals, int eat, int weight, int time) {
        return (animals * eat * weight * time);

    }

}
