package com.hillel.homework.lesson14.converterWithClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Degrees {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Please, input value in celsius : ");
        String value = READER.readLine();
        System.out.println("please, select converter and input  kelvin or fahrenheit :");
        String input= READER.readLine();
        double result = createConverter(input).covert(Double.parseDouble(value));
        System.out.println("result : " + result);
    }
    public static Converter createConverter(String input)  {
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
}


