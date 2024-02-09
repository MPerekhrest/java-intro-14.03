package com.hillel.homework.algorytmicminute;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(original));
        int[] reorderedR = new int[original.length];
        int shiftR = 2;

        for (int i = 0; i < original.length; i++)
            reorderedR[(shiftR + i) % original.length] = original[i];
        System.out.println(Arrays.toString(reorderedR));

        int[] reorderedL = new int[original.length];
        int shiftL = 2;
        for (int i = 0; i < original.length; i++)
            reorderedL[i] = original[(shiftL + i) % original.length];
        System.out.println(Arrays.toString(reorderedL));

    }
}