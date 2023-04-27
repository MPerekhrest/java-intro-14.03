package com.hillel.classwork.lesson6;

public class StringOverLoading {
    public static void main(String[] args) {
        printString("", "");
        printString("", "", "");
        printString("", 4);
    }

    public static void printString(String one, String two) {
        System.out.println(" one " + one + " two " + two);
    }

    public static void printString(String one, String two, String three) {
        System.out.println(" one " + one + " two " + two + " three " + three);
    }

    public static void printString(String one, int number) {
        System.out.println(" one " + one + " number " + number);
    }
}
