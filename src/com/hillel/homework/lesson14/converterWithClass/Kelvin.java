package com.hillel.homework.lesson14.converterWithClass;

public class Kelvin implements Converter{
    @Override
    public double covert(double value) {
        return value + 273.15;
    }
}
