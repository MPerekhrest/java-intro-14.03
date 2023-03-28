package com.hillel.homework.lesson3;

public class MathDouble {
    public static void main(String[] args) {
        double a = 45, b = 75, c = 32;
        double m = Math.abs (a-b);
        double p = Math.pow (a+b, 3);
        double s = Math.sqrt(c);
        double result = m/p - s;
        System.out.println("|a - b| / (a + b) ^ 3 -√с = " + result);
    }
}
