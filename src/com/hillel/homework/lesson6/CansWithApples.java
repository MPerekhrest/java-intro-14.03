package com.hillel.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CansWithApples {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter the number of apples :");
        int numberApples = Integer.parseInt(reader.readLine());
        int applesInLagerCan = 5;
        int applesInMediumCan = 3;
        int applesInSmallCan = 1;

        int lagerCans = calculateCans(numberApples, applesInLagerCan);
        System.out.println("lagerCans = " + lagerCans);
        int resultLeft = calculateLeft(numberApples, applesInLagerCan);
        System.out.println("Left apples = " + resultLeft);
        int middleCans = calculateCans(resultLeft, applesInMediumCan);
        System.out.println("middleCans = " + middleCans);
        int resultLeftMiddle = calculateLeft(resultLeft, applesInMediumCan);
        System.out.println("Left apples = " + resultLeftMiddle);
        int smallCans = calculateCans(middleCans, applesInSmallCan);
        System.out.println("smallCans = " + smallCans);
        int resultLeftSmall = calculateLeft(resultLeftMiddle, applesInSmallCan);
        System.out.println("Left apples = " + resultLeftSmall);

    }

    public static int calculateCans(int numberApples, int applesInCans) {
        return numberApples / applesInCans;
    }

    public static int calculateLeft(int numberApples, int applesInCans) {
        return numberApples % applesInCans;
    }
}
