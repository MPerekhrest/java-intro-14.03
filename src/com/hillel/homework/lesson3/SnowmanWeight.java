package com.hillel.homework.lesson3;

public class SnowmanWeight {
    public static void main(String[] args) {
        double r1 = 1, r2 = 0.5, r3 = 0.2;
        double p = 0.7;
        double x = 4.0 / 3 * Math.PI;
        double V1 = x * Math.pow (r1, 3);
        double V2 = x * Math.pow (r2, 3);
        double V3 = x * Math.pow (r3, 3);
        double V = V1 + V2 + V3;
        double m = p * V;
        System.out.println(" m = p * V = " + m + "kg");
    }
}
