package com.hillel.classwork.lesson9;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        fill(numbers);

        long start = System.currentTimeMillis();
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
          numbers[i] = (int) (Math.random() * 100);
        }
    }
}
