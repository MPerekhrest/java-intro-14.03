package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeParametersOptimisation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number1 :");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter operator + , -, /, * :");
        String operator;
        operator = reader.readLine();
        System.out.println("Enter number2 :");
        double number2 = Integer.parseInt(reader.readLine());
        double result = calculateOperation(number1, operator, number2);
        System.out.println(result);
    }

    public static double calculateOperation(int number1, String operator, double number2) {
        double operation = 0;

        switch (operator) {

            case "+" -> {
                double add = number1 + number2;
                System.out.println("+ " + add);
                operation = add;
            }
            case "-" -> {
                double subtract = number1 - number2;
                System.out.println("-" + subtract);
                operation = subtract;
            }
            case "*" -> {
                double multiply = number1 * number2;
                System.out.println("*" + multiply);
                operation = multiply;

            }
            case "/" -> {
                if (number2 == 0) {
                    System.out.println(" number2 is not correct ");
                    return number2;
                }
                double divide = number1 / number2;
                System.out.println("/" + divide);
                operation = divide;
            }

        }
        return operation;

    }
}


