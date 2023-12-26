package com.hillel.homework.lesson13;

public class Commercial extends AbstractTax {
    private final double mRevenue;
    public Commercial(double s, double taxK, double revenue) {
        super(s, taxK);
        mRevenue = revenue;
      
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "mRevenue=" + mRevenue +";"+
                "area=" + s +";"+
                "tax/meter=" + taxK +
                '}';
    }

    public double calculateTax() {
        if (mRevenue > 100) {
           return super.calculateTax();

        } else {
            return 0;
        }
    }
}