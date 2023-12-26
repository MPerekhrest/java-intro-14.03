package com.hillel.homework.lesson13;

public class Residential extends AbstractTax {
    private final double mSubsidies;

    public Residential(double s, double taxK, double subsidies) {
        super(s, taxK);
        mSubsidies = subsidies;
    }

    public double calculateTax() {
        return super.calculateTax() * mSubsidies / 100;

    }

    @Override
    public String toString() {
        return "Residential{" +
                "mSubsidies=" + mSubsidies +";"+
                "area=" + s +";"+
                "tax/meter=" + taxK +
                '}';
    }
}

