package com.hillel.homework.lesson5;

public class Scholarship {
    public static void main(String[] args) {
        double average = averageScore(10, 3, 7, 9, 8);
        System.out.println("the average score = " + average);
        printAverage(average);
    }

    private static void printAverage(double average) {
        if (average >= 10) {
            System.out.println(" the student will receive increased scholarship");
        } else if (average < 10 && average >= 8) {
            System.out.println("the student will receive just scholarship");
        } else {
            System.out.println(" the student will not  receive scholarships");
        }
    }

    public static double averageScore(double math, double language, double history, double philosophy, double cultural) {
        return (math + language + history + philosophy + cultural) / 5;
    }

}
