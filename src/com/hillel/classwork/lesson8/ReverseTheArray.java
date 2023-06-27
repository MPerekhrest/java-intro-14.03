package com.hillel.classwork.lesson8;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReverseTheArray {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] numbers = new int[10];
        System.out.println(" input 10 numbers : ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " element: ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
        printArray(numbers);
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int i = numbers.length - 1;  i >= 0 ; i--) {

            System.out.println(i  + " index " + numbers[i]);
        }
    }
}
