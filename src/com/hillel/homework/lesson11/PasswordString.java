package com.hillel.homework.lesson11;

import java.util.Random;

public class PasswordString {

    public static void main(String[] args) {

        String smallLet = "abcdefghijklmnopqrstuvwxyz";
        String bigLet = smallLet.toUpperCase();
        String numbers = "0123456789";
        String chars = "_";
        String combination = bigLet + smallLet + numbers + chars;
        int len = 8;
        Random random = new Random();
        char[] password = new char[len];
        boolean isChars = false;
        int count = 0;
        while (!isChars) {

            for (int i = 0; i < len; i++) {
                password[i] = combination.charAt(random.nextInt(combination.length()));
            }
            boolean hasSmallLetter = false;
            boolean hasBigLetter = false;
            boolean hasNumber = false;
            boolean hasChar = false;

            for (int i = 0; i < password.length; i++) {
                char c = password[i];
                if (smallLet.indexOf(c) != -1) {
                    hasSmallLetter = true;
                } else if (bigLet.indexOf(c) != -1) {
                    hasBigLetter = true;
                } else if (numbers.indexOf(c) != -1) {
                    hasNumber = true;
                } else if (chars.indexOf(c) != -1) {
                    hasChar = true;
                }
                count ++;
            }

            isChars = hasSmallLetter && hasBigLetter && hasNumber && hasChar;
        }
        System.out.println("Generated Password is:" + new String(password));
        System.out.println(count);
    }
}
