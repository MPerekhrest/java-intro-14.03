package com.hillel.homework.lesson9;

import java.util.Arrays;


//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > array[i]) {
//                    int temp = array[j];
//                    array[j] = array[i];
//                    array[i] = temp;
//                }
public class TaskTwoSortArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 0, 9, 0, 45, 22, 0};
        System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                int index = searchSmallest(array, i);
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    private static int searchSmallest(int[] array, int low) {
        int smallest = array[low];
        int smallestIndex = low;
        for (int i = low + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}


//  }          }
//        }
//      System.out.println(Arrays.toString(array));