package com.hillel.classwork.lesson10;

public class Classwork {
    public static void main(String[] args) {
        int[] square = new int[9];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
        int[] rightTriangle = new int[9];
        for (int i = 0; i < rightTriangle.length + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" # ");

            }
            System.out.println();
        }
    }

}
