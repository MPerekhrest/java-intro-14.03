package com.hillel.homework.lesson7;

public class LuckyNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i / 10 != 4 && i % 10 != 4 && i % 10 != 9 && i / 10 != 9) {
                System.out.println("i = " + i);
            }
        }
    }
}
