package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetermineTheMaxNumber {
    public static void main(String[] args) throws IOException {
        int[] values = {20, 56, 67, 23, 40, 99, 1, 29, 78};
        int index = 0;
        int max = values[index];

        for (int i = 1; i < values.length ; i++) {
            if (values[i] > max){
                max = values[i];
                index = i;
            }

        }

        System.out.println(index + " murder " + max);
    }


}


