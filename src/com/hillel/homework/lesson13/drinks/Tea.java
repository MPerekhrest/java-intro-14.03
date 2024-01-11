package com.hillel.homework.lesson13.drinks;

import com.hillel.homework.lesson13.drinks.Beverage;
import com.hillel.homework.lesson13.interfaces.BeverageInterface;

public class Tea extends Beverage implements BeverageInterface {
    public Tea() {
        super();
        this.setPrice();
    }

    public void setPrice() {
        this.price = 5;
    }
}



