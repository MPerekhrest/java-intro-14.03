package com.hillel.homework.lesson13;

public abstract class AbstractTax {
    protected final double s;
    protected final double taxK;

    public AbstractTax(double s, double taxK) {
        this.s = s;
        this.taxK = taxK;
    }

    public double calculateTax() {
        return s * taxK;
    }


}

