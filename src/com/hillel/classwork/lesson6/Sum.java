package com.hillel.classwork.lesson6;

public class Sum {
    public static void main(String[] args) {
        long a = 34;
        long b = 78;
        int c = 45;
        int d = 78;
        double i = 78.67;
        double f = 99.99;
        double result = sum(c, d);
        System.out.println(sum(7000L, 356L));
        System.out.println(sum(99.9, 78.76));
        System.out.println(sum(45, 78));

    }

    public static double sum(long a, long b) {
        return a + b;
    }

    public static double sum(double i, double f) {
        return i + f;
    }

    public static double sum(int c, int d) {
        return c + d;
    }
}
