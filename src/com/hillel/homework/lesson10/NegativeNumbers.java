package com.hillel.homework.lesson10;

public class NegativeNumbers {
    public static void main(String[] args) {
        int[][] array = {{-6, 5, 4}, {9, -2, 8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i > array[i][j] || j > array[i][j]) {
                    System.out.print(i + " " + j);
                }
                System.out.println();

            }

        }
    }
}
