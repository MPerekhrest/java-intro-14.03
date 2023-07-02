package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PickCode {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String password = reader.readLine();
        char[] passwordArray = new char[password.length()];
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            passwordArray[i] = password.charAt(i);
            String c = String.valueOf(password.charAt(i));

            for (int j = 0; j < 10; j++, counter++) {

                if (Integer.parseInt(c) == j) {

                    System.out.println(j);
                    break;
                }
            }
        }
        System.out.println("operation-iteration: " + counter);
        System.out.println(passwordArray);
    }

}
