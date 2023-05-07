package com.hillel.homework.lesson7;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WashingTheCarFor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" input the number of cars to be washed: ");
        int numberCars = Integer.parseInt(reader.readLine());
        if (numberCars <= 0) {
            System.out.println(" incorrect number car ");
            return;
        }

        for (; numberCars != 0; numberCars--) {
            printSoap(numberCars);
            printWash(numberCars);
            printDry(numberCars);
            System.out.println(numberCars + " car is clean");
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


