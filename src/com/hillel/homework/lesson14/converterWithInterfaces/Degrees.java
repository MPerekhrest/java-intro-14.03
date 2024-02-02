package com.hillel.homework.lesson14.converterWithInterfaces;

import com.hillel.homework.lesson14.converterWithInterfaces.types.Celsius;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Degrees {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        double value = getInputValue();
        char type = getInputType();

        Celsius celsius = new Celsius(value);
        double result = celsius.covert(type);
        System.out.println(result);
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
        System.out.println("Input value degrees in the celsius  : ");

        String input = "";
        boolean inputReady = false;
        while (!inputReady) {
            input = READER.readLine();
            if (isNumber(String.valueOf(input))) {
                inputReady = true;
            } else {
                System.out.println("Input valid value only in the numbers: ");
            }
        }
        System.out.println("Input value: " + input);
        return Double.parseDouble(input);
    }

    public static char getInputType() throws IOException {
        System.out.println("input convert degrees  in the kelvin(K) or fahrenheit(F): ");

        String input = "";
        boolean typeReady = false;
        while (!typeReady) {
            input = READER.readLine().toUpperCase();
            if (input.equals("K") || input.equals("F")) {
                typeReady = true;
            } else {
                System.out.println("Input valid value only liters K or F : ");
            }

        }
        System.out.println("Input type: " + input);
        return input.toCharArray()[0];
    }
}

