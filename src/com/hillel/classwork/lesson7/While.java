package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class While {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = READER.readLine();
        double sum = 0;
        while (!input.equalsIgnoreCase("sum")) {
            sum += Integer.parseInt(input);
            input = READER.readLine();
        }
        System.out.println("sum" + sum);
    }
}
