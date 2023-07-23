package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialHomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" input number factorial: ");
        int number  = Integer.parseInt(reader.readLine());
        System.out.println(factorial(number));
    }

    public static int factorial(int number){
        if (number == 1) {
            return number;
        }
        return number * factorial(number-1);
    }
}
