package com.hillel.homework.lesson14.DuckShipHuman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExampleClass {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Active> actives = new ArrayList<>();
        System.out.println("please input example : ");
        String input;
        while (!(input = READER.readLine()).equals("")) {
            actives.add(getActive(input));

        }
        exampleActive(actives);
    }

    public static Active createActive(String activeName) {
        return switch (activeName) {

            case "human" -> new Human();
            case "duck" -> new Duck();
            case "ship" -> new Ship();
            default -> throw new IllegalArgumentException();
        };
    }

    public static void exampleActive(List<Active> actives) {
        for (Active active : actives) {
            if (active instanceof Flyable flyableActive) {
                flyableActive.fly();
            }
            if (active instanceof Runnable runnableActive) {
                runnableActive.run();
            }
            if (active instanceof Swimmable estimableActive) {
                estimableActive.swim();
            }
        }
    }

    private static Active getActive(String input) throws IOException {
        try {
            return createActive(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(input + " is invalid input. Try again");
            System.out.println("please input valid : ");
            return getActive(READER.readLine());
        }
    }
}