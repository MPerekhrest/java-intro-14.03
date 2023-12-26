package com.hillel.homework.lesson13;

import java.util.ArrayList;
import java.util.List;

public class RealEstateTax {
    public static void main(String[] args) {

        AbstractTax industrial = new Industrial(45, 3);
        AbstractTax commercial = new Commercial(24, 23, 101);
        AbstractTax residential = new Residential(34, 56, 1);

        List<AbstractTax> abstractTaxes = new ArrayList<>();
        abstractTaxes.add(industrial);
        abstractTaxes.add(commercial);
        abstractTaxes.add(residential);
        abstractTaxes.add(new Commercial(34, 34, 34));

        for (AbstractTax abstractTax : abstractTaxes) {
            abstractTax.calculateTax();
            System.out.println(abstractTax + " tax = " + abstractTax.calculateTax());
        }
    }
}
