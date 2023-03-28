package com.hillel.homework.lesson3;

public class Math3_1float {
    public static void main(String[] args) {
        float a = 45;
        float b = 75;
        float c = 32;

        System.out.println( "|a - b| / (a + b) ^ 3 -√с = " + ((Math.abs(a-b))/(Math.pow((a+b), 3)) - (Math.sqrt(c))) );

    }

}
