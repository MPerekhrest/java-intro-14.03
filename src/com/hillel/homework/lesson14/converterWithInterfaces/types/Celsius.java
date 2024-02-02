package com.hillel.homework.lesson14.converterWithInterfaces.types;

import com.hillel.homework.lesson14.converterWithInterfaces.interfaces.Converter;
import com.hillel.homework.lesson14.converterWithInterfaces.interfaces.Fahrenheitable;
import com.hillel.homework.lesson14.converterWithInterfaces.interfaces.Kelvinable;

public class Celsius implements Converter, Fahrenheitable, Kelvinable {


    private double value;

    public Celsius(double value) {
        this.setValue(value);
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double covert(char type) {

     if (type == 'F') {
            return this.toFahrenheit();
        }
        return this.toKelvin();

    }

    @Override
    public double toFahrenheit() {
        return this.value * 1.8 + 32;
    }

    @Override
    public double toKelvin() {
        return this.value + 273.15;
    }
}
