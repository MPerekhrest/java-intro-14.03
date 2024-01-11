package com.hillel.homework.lesson13;

import com.hillel.homework.lesson13.drinks.*;
import com.hillel.homework.lesson13.interfaces.BeverageInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DrinkForUser {
    private static ArrayList drinkList;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please select drink(max five drinks) : ");

        for (int i = 0; i < DrinkType.values().length; i++) {
            System.out.println("Select: " + (i + 1) + ": " + DrinkType.values()[i]);
        }
        System.out.println("select 0 for finish  ");

        ArrayList<BeverageInterface> drinkList = new ArrayList<>();

        boolean isReady = true;
        while (isReady) {
            String choice = reader.readLine();
            switch (choice) {
                case "1", "2", "3", "4" -> {
                    SimpleDrinkFactory drinkFactory = new SimpleDrinkFactory();
                    BeverageInterface bev = (BeverageInterface) drinkFactory.create(choice);
                    drinkList.add(bev);
                    printPreparingDrinksList(drinkList, false);
                }
                case "0" -> {
                    isReady = false;
                    printPreparingDrinksList(drinkList, true);

                }

                default -> System.out.println("Invalid choice. Please choose a valid drink.");
            }
        };




    }
        public static void printPreparingDrinksList (ArrayList drinkList, boolean isReady){

            if (isReady) {
                System.out.println("------------------------------");
                double total = 0;
                for (int i = 0; i < drinkList.size(); i++) {
                    Beverage bev = (Beverage) drinkList.toArray()[i];
                    System.out.println(bev.order());
                    total =+total + bev.getPrice();
                    System.out.println(total + " PLN");
                }

                System.out.println("------------------------------");
                System.out.println("Your order is ready!");
                System.out.println("Total:" + total + " PLN");

            } else {
                System.out.println("------------------------------");
                for (int i = 0; i < drinkList.size(); i++) {
                    Beverage bev = (Beverage) drinkList.toArray()[i];
                    System.out.println(bev.prepare());
                }
                System.out.println("------------------------------");
                System.out.println("Select zero for finished order");
            }
        }


}

