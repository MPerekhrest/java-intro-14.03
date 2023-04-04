package com.hillel.homework.lesson4;

public class Aircrafts {
    public static void main(String[] args) {

        Aircrafts.printAirplaneInfo("Jet"," F -22 Raptor " );
        Aircrafts.printAirplaneInfo("Airliner","Aerobus 737","120");
        printAirplaneInfo("Airliner","Boeing 777","180", "28");

    }
    public static void printAirplaneInfo( String firstAircraft, String firstModel){
        System.out.println("type of aircraft: " + firstAircraft + ", model: "+ firstModel );
    }
    public static void printAirplaneInfo( String secondAircraft, String secondModel, String numberPassengersEconomy){
        System.out.println( "type of aircraft: " + secondAircraft + ", model: " + secondModel+ ", number economy class passengers:" + numberPassengersEconomy );
    }
    public static void printAirplaneInfo (String thirdAircraft, String thirdModel,String numberPassengersEconomy, String numberPassengersBusinnes){
        System.out.println( "type of aircraft: " + thirdAircraft + ", model: " + thirdModel+ ", number economy class passengers:" + numberPassengersEconomy +", number business class passengers: " + numberPassengersBusinnes );
    }
}
