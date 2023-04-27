package com.hillel.classwork.lesson7;

public class DoWhile {
    public static void main(String[] args) {

        /*int i = 10;
        do {
            System.out.println("i = " + i);
            i--;
        } while (i >= 10);*/

        int i = 10;
        do {

            System.out.println("left before the explosion " + i + "sec");
            i--;
            if (i <= 5) {
                break;
            }
        } while (i >= 0);
        if (i == 0) {
            System.out.println("Boom!!!");
        } else {
            System.out.println("Not boom!!!");
        }
    }
}