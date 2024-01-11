package com.hillel.homework.lesson13.drinks;

import com.hillel.homework.lesson13.drinks.Beverage;
import com.hillel.homework.lesson13.interfaces.BeverageInterface;

public class Americano extends Beverage implements BeverageInterface {

    @Override
    public String prepare() {
        return super.prepare();
    }

    @Override
    public String order() {
        return super.order();
    }

    public Americano() {
        super();
        this.setPrice();
    }

    public void setPrice() {
        this.price = 6.7;
    }

}



