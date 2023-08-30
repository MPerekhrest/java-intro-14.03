package com.hillel.classwork.lesson12;

public class CatsForFight {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3, 4, 5);
        Cat cat2 = new Cat(2, 2, 2);
        Cat cat3 = new Cat(6, 6, 8);
        System.out.println(cat1 + " win " + cat2 + " ? " + cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }


}
