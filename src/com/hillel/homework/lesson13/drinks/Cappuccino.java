package com.hillel.homework.lesson13.drinks;

import com.hillel.homework.lesson13.drinks.Beverage;
import com.hillel.homework.lesson13.interfaces.BeverageInterface;

public class Cappuccino extends Beverage implements BeverageInterface {
    public Cappuccino() {
        super();
        this.setPrice();
    }

    public void setPrice() {
        this.price = 6.5;
    }
}

