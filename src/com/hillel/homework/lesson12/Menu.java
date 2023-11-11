package com.hillel.homework.lesson12;

import java.util.Random;

class Menu {
    public String name;
    public int price;
    public String listOfIngredients;
    public String spicyNoSpicy;
    public String veganNonVegan;

    public Menu() {
        this.name = getRandomNameValue(names);
        this.price = getRandomPrice(30, 100);
        this.listOfIngredients = getRandomNameValue(listOfIngredient);
        this.spicyNoSpicy = getRandomNameValue(spicyNo);
        this.veganNonVegan = getRandomNameValue(veganNon);
    }

    public static String[] names = {"Pizza Margarita", "Pizza Pepperoni", "Pizza Vegetarian", "Burgers", "Omlette", "Beef Tripe", "TomatoesT soup"};
    public static String[] listOfIngredient = {"Tomato", "Bekon", "Beef", "Cheese"};
    public static String[] spicyNo = {"spicy", " non spicy"};
    public static String[] veganNon = {"vegan ", "non vegan"};

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", listOfIngredients='" + listOfIngredients + '\'' +
                ", spicyNoSpicy='" + spicyNoSpicy + '\'' +
                ", veganNonVegan='" + veganNonVegan + '\'' +
                '}';
    }

    public static int getRandomPrice(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String getRandomNameValue(String[] value) {
        Random random = new Random();
        int index = random.nextInt(value.length);
        return value[index];
    }


}
