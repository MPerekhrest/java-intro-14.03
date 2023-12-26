package com.hillel.homework.lesson13;

public class Industrial extends AbstractTax {
    public Industrial(double s, double taxK) {
        super(s, taxK);
    }
    public String toString() {
        return "Industrial{" +
                "area=" + s +";"+
                "tax/meter=" + taxK +
                '}';
    }

    public double calculateTax() {
        return super.calculateTax();
    }

}

