package com.hillel.homework.lesson4;

public class Aircrafts {
    public static void main(String[] args) {


        printAirplaneInfo("Jet", " F -22 Raptor ");
        printAirplaneInfo("Airliner", "Aerobus 737", 120);
        printAirplaneInfo("Airliner", "Boeing 777", 180, 28);

    }

    public static void printAirplaneInfo(String name, String model) {
        System.out.println("type of aircraft: " + name + ", model: " + model);

    }

    public static void printAirplaneInfo(String name, String model, int numberPassengersEconomy) {
        System.out.println("type of aircraft: " + name + ", model: " + model + ", number economy class passengers:" + numberPassengersEconomy);
    }

    public static void printAirplaneInfo(String name, String model, int numberPassengersEconomy, int numberPassengersBusiness) {
        System.out.println("type of aircraft: " + name + ", model: " + model + ", number economy class passengers:" + numberPassengersEconomy + ", number business class passengers: " + numberPassengersBusiness);
    }
}
