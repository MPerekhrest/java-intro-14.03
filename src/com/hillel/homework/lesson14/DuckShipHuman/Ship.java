package com.hillel.homework.lesson14.DuckShipHuman;

public class Ship extends Active implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Chip can swim");
    }
}
