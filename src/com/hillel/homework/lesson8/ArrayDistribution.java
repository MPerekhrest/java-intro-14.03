package com.hillel.homework.lesson8;

import com.hillel.classwork.lesson8.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayDistribution {
    public static void main(String[] args) throws IOException {

        String[] bigArray = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(bigArray));
        String[] smallArray1 = new String[bigArray.length / 2];
        for (int i = 0; i < smallArray1.length; i++) {
            smallArray1[i] = bigArray[i];

        }
        System.out.println(Arrays.toString(smallArray1));


        String[] smallArray2 = new String[bigArray.length / 2];
        for (int i = 0; i < smallArray2.length; i++) {
            smallArray2[i] = bigArray[i + bigArray.length / 2];

        }
        System.out.println(Arrays.toString(smallArray2));

    }
}
