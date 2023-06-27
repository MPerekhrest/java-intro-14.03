package com.hillel.homework.lesson8;

import java.util.Arrays;

public class TwoSoccerTeams {
    public static void main(String[] args) {
        int min = 18;
        int max = 60;
        int size = 20;
        int[] playersFirstTeam = createTeam(min, max, size);
        System.out.println(Arrays.toString(playersFirstTeam));
        int[] playersSecondTeam = createTeam(min, max, size);
        System.out.println(Arrays.toString(playersSecondTeam));

        int averageAgeFirstTeam = calculateAverageAge(playersFirstTeam);
        int averageAgeSecondTeam = calculateAverageAge(playersSecondTeam);
        System.out.println("team 1 = " + averageAgeFirstTeam);
        System.out.println("team 2 = " + averageAgeSecondTeam);
        int maxAge = Math.max(averageAgeFirstTeam, averageAgeSecondTeam);
        System.out.println("max age team = " + maxAge);
    }

    public static int calculateAverageAge(int[] playersTeam) {
        int sumYearTeam = 0;
        for (int j : playersTeam) {
            sumYearTeam = sumYearTeam + j;
        }
        return sumYearTeam / playersTeam.length;
    }

    public static int[] createTeam(int min, int max, int size) {
        int[] playersTeam = new int[size];
        for (int i = 0; i < playersTeam.length; i++) {
            double random = Math.random();
            playersTeam[i] = (int) ((random * (max - min)) + min);
        }
        return playersTeam;
    }
}
