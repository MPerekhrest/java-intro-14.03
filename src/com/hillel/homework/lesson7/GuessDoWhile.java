package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessDoWhile {
    public static void main(String[] args) throws IOException {

        int r = new Random().nextInt(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a number: ");
        int number;

        do {
            number = Integer.parseInt(reader.readLine());
        } while (number != r);
        System.out.println(" you guessed");
    }
}


