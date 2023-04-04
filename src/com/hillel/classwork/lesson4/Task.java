package com.hillel.classwork.lesson4;

public class Task {
    public static void main(String[] args) {

        float x = 1000;
        float y = 2000;
        float z = 3000;
        float x10 = 120 * x;
        float y10 = 120 * y;
        float z10 = 120 * z;
        System.out.println(x10);
        System.out.println(y10);
        System.out.println(z10);
        double t = 0.05;
        double x5 = x10 * t;
        double y5 = y10 * t;
        double z5 = z10 * t;
        System.out.println(z5);
        System.out.println(y5);
        System.out.println(x5);
        double suma = ((x10 + y10 + z10) - (x5+y5+z5))/ 3;
        System.out.println(suma);
    }
}
