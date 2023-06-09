package com.hillel.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WashingTheCar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input the number of cars to be washed: ");
        int numberCars = Integer.parseInt(reader.readLine());

        while (numberCars > 0) {
            printSoap(numberCars);
            printWash(numberCars);
            printDry(numberCars);
            numberCars--;
            System.out.println(" Car is clean");
        }
        System.out.println("These cars is clean");
    }

    public static void printSoap(int numberCars) {
        System.out.println("Car is soaping: " + numberCars);
    }

    public static void printWash(int numberCars) {
        System.out.println("Car is washing: " + numberCars);
    }

    public static void printDry(int numberCars) {
        System.out.println("Car is drying : " + numberCars);
    }


}

