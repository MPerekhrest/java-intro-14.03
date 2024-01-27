package com.hillel.homework.lesson14.DuckShipHuman;

public class Human extends Active implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Human can run ");
    }

    @Override
    public void swim() {
        System.out.println("Human can swim ");
    }
}
