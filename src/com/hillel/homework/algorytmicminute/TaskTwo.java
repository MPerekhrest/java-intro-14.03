package com.hillel.homework.algorytmicminute;

public class TaskTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == 5) {
                    System.out.println(" indexes: " + i + j);
                }
            }
        }
    }
}