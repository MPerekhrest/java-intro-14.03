package com.hillel.homework.lesson14.DuckShipHuman;

public class Duck extends Active implements Flyable, Runnable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void run() {
        System.out.println("Duck can run");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
