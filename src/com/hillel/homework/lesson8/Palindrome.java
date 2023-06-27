package com.hillel.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] result = str.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < result.length; i++) {

            if (result[i] != result[result.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("is string " + str + " palindrome ? " + isPalindrome);

    }
}

//      System.out.println(isPalindrome("abba"));


//    static boolean isPalindrome (String []text){
//        for (int i = 0; i < text.length(); i++) {
//            if (text.toCharArray(i) != text.toCharArray(text.length()-1-i))
//                return false;
//
//        }return true;
//    }
//System.out.println(Arrays.toString(isPalindrome("abba")));


//    static public String [] isPalindrome (String text){
//
//        for (int i = 0; i < Array.length/2; i++) {
//
//        }
//        return ;
//    }

