package com.hillel.homework.lesson9;

import com.hillel.classwork.lesson9.ArraySort;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static final BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = 7;
        int min = 0;
        int max = 9;
        int[] firstArray = new int[size];
        int[] secondArray = new int[size];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * max + min);
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println("input numbers into range 0 - 9 : ");
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = getNumber();
            System.out.println("user input numbers : " + Arrays.toString(secondArray));
        }

        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (firstArray[i] == secondArray[i]) {

                System.out.println((i) + " elements matched");
                counter++;
            }
        }
        System.out.println(" number of matches: " + counter);
    }

    public static int getNumber() throws IOException {
        int min = 0;
        int max = 9;
        int number = Integer.parseInt(Reader.readLine());
        while (!(number >= min && number <= max)) {
            System.out.println("number is incorrect");
            System.out.println("input is correct number : ");
            number = Integer.parseInt(Reader.readLine());
        }
        return number;
    }
}
