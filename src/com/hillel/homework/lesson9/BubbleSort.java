package com.hillel.homework.lesson9;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 55, 87, 34, 45, 23, 43, 32, 98, 54, 12, 19, 29};
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
