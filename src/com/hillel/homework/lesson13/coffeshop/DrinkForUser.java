package com.hillel.homework.lesson13.coffeshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DrinkForUser {
    private static List<Beverage> drinkList = new ArrayList<>();
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        SimpleDrinkFactory drinkFactory = new SimpleDrinkFactory();

        printDrinkInformation();
        getService(drinkFactory);
    }

    private static void getService(SimpleDrinkFactory drinkFactory) throws IOException {
        boolean isReady = true;
        while (isReady) {
            String input = reader.readLine();
            if (!input.equals("")) {
                DrinkType choice = getDrinkType(input);
                printDelimeter();
                drinkList.add(drinkFactory.create(choice));
            } else {
                isReady = false;
                printPreparing(drinkList);
                printOrder(drinkList);
            }
        }
    }

    private static void printDrinkInformation() {
        System.out.println("please select drink : ");
        for (DrinkType drinkType : DrinkType.values()) {
            System.out.println(drinkType);
        }
        System.out.println("To finish press enter ");
    }

    private static  DrinkType getDrinkType(String input) throws IOException {
        try {
            return DrinkType.valueOf(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(input + " is invalid input. Try again");
            System.out.println("please input valid:");
            return getDrinkType(reader.readLine());
        }
    }
    private static void printDelimeter() {
        System.out.println("------------------------------");
    }

    public static void printPreparing(List<Beverage> drinkList) {
        for (int i = 0; i < drinkList.size(); i++) {
            Beverage bev = (Beverage) drinkList.toArray()[i];
            System.out.println(bev.prepare());
            System.out.println(bev.order());
        }
        System.out.println("------------------------------");
    }
    public static void printOrder(List<Beverage> drinkList) {
        double total = 0;
        for (Beverage beverage : drinkList) {
            total += beverage.getPrice();
        }

        System.out.println("Your order is ready!");
        System.out.println("Total:" + total + " PLN");
    }


}

