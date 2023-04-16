package com.hillel.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter are height, length, width: ");

        double height = Integer.parseInt(reader.readLine());
        System.out.println(" height : " + height);
        double length = Integer.parseInt(reader.readLine());
        System.out.println("length : " + length);
        double width = Integer.parseInt(reader.readLine());
        System.out.println("width : " + width);

        if (isBagOk(height, length, width) || isSuitOk(height, length, width)) {
            System.out.println(" your Hand Luggage is ok");
            return;
        }
        System.out.println("your Hand Luggage is bad");
    }

    public static boolean isBagOk(double height, double length, double width) {
        return height <= 40 && length <= 55 && width <= 20;
    }

    public static boolean isSuitOk(double height, double length, double width) {
        return height <= 53 && length <= 40 && width <= 22;
    }
}


