package com.hillel.homework.lesson14.converterWithClass;

public class Fahrenheit implements Converter {
    @Override
    public double covert(double value) {
        return value * 1.8 + 32;
    }
}
