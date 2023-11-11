package com.hillel.homework.lesson12;

import java.util.Random;

class Person {

    public String firstName;
    public String lastName;

    public int age;
    public int weight;
    public int height;

    public Person() {
        this.firstName = getRandomName();
        this.lastName = getRandomSurname();
        this.age = getRandomNumber(18, 86);
        this.weight = getRandomNumber(50, 100);
        this.height = getRandomNumber(165, 200);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String[] NAMES =
            {"klaudia", "John", "Lucia", "Stefania", "Lilia", "Irena", "Miki", "Adam", "Jakub", "Leon"};

    public static String getRandomName() {
        Random random = new Random();
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }

    public static String[] SURNAMES =
            {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", " Davis", "Wilson", "Thomas "};

    public static String getRandomSurname() {

        Random random = new Random();
        int index = random.nextInt(SURNAMES.length);
        return SURNAMES[index];
    }
}
