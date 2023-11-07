package com.hillel.homework.lesson12;
public class PersonController {
    public static void main(String[] args) {
        int count = 0;
        Person[] persons = new Person[100];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println(persons[i]);
            count++;
        }

        System.out.println(count);

    }


}