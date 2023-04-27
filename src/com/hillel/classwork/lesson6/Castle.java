package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Castle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int start = 1000;
        int end = 1500;
        int distance = Integer.parseInt(reader.readLine());
        System.out.println("shit" + distanceCastle(1000,1500,900
        ));
    }
    public static boolean distanceCastle(int start, int end, int distance){
        if (distance >= start && distance <= end){
            return true;
        }else{
            return false;
        }

    }
}

