package com.hillel.homework.lesson14.converterWithClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Degrees {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        double value = getInputValue();
        System.out.println("please, select converter and input  kelvin or fahrenheit :");
        String input = READER.readLine();
        eConverter(input);
        double result = createConverter(input).covert((value));
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
            System.out.println(input + " is invalid input. Try again");
            System.out.println("please input valid : ");
            return eConverter(READER.readLine());
        }
    }

    public static boolean isNumber(String str) {
        try {
            double v = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    public static double getInputValue() throws IOException {
        System.out.println("Please, input value in celsius : ");

        String value = " ";
        boolean valueReady = false;
        while (!valueReady) {
            value = READER.readLine();
            if (isNumber(String.valueOf(value))) {
                valueReady = true;
            } else {
                System.out.println("Input valid value only in the numbers:");
            }
        }
        System.out.println("Input value: " + value);
        return Double.parseDouble(value);
    }


}




