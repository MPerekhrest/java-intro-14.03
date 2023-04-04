package com.hillel.classwork.lesson4;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Box {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input width, heigt, depth : ");

       int width = scanner.nextInt();
        int height = scanner.nextInt();
        int depth = scanner.nextInt();

        int volume = calculateVolume(width, height, depth);
        System.out.println(volume);

        System.out.println(calculateVolume( 345, 666, 344));

    }

    public static int calculateVolume(int width, int height, int depth){

        int volume;
        volume = width * height * depth;
        return volume;
    }


}
