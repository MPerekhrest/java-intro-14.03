package com.hillel.homework.lesson14.converterWithClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Degrees {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double value = getInputValue();
        System.out.println(value);
        System.out.println("write kelvin or fahrenheit convert : ");
        String input = READER.readLine();
        double result = eConverter(input).covert(value);
        System.out.println("result : " + result);
    }

    public static Converter createConverter(String input) {
        return switch (input) {
            case "kelvin" -> new Kelvin();
            case "fahrenheit" -> new Fahrenheit();
            default -> throw new IllegalArgumentException();
        };
    }

    private static Converter eConverter(String input) throws IOException {
        try {
            return createConverter(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(input + " is invalid input.");
            System.out.println("writing please kelvin or fahrenheit : ");
            return eConverter(READER.readLine());
        }
    }
    public static double getInputValue() throws IOException {
        System.out.println("Please, input value in celsius : ");

        String value;
        Double doubleValue = null;
        while (doubleValue == null) {
            value = READER.readLine();
            try {
                doubleValue = Double.parseDouble(value);
            } catch (NumberFormatException ignored) {
                System.out.println("Input valid value only in the numbers:");
            }
        }
        System.out.println("Input value: " + doubleValue);
        return doubleValue;
    }

}




