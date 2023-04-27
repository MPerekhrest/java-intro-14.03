package com.hillel.classwork.lesson7;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        do {
            System.out.println("left before the explosion " + i + "sec");
            Thread.sleep(1000);
            i--;
        } while (i >= 0);
        System.out.println("Boom!!!");
    }
}


