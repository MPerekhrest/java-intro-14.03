package com.hillel.homework.lesson11;

public class CatMain {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5, 10, "Scotland");
        System.out.println(barsik);
        Cat bawik = new Cat("Bawik", 5);
        System.out.println("Cat is name: " + bawik.name + ", cat age:" + bawik.age);
        System.out.print(barsik.equals(bawik));
    }

}
