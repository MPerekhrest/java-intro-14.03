package com.hillel.homework.lesson8;

public class SquareAndTriangle {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++)
                System.out.print(" * ");
            System.out.println();

        }
        int length = 10;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" # ");
            System.out.println();
        }
    }
}
