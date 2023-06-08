package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumbers {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter numbers: ");


        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int min = minValue(number1, number2, number3);
        System.out.println(min);
    }

    public static int minValue(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            return number1;
        } else if (number2 <= number1 && number2 <= number3) {
            return number2;
        } else {
            return number3;
        }
    }
}