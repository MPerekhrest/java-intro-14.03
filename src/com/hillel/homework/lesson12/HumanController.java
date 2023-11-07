package com.hillel.homework.lesson12;

public class HumanController {
    public static void main(String[] args) {


        Human father = new Human("Oscar");
        Human mother = new Human("Rebeca");
        Human human = new Human("Tom", father, mother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(human);

    }

}