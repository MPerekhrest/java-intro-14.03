package com.hillel.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TransposingMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" input matrix size row and column: ");
        int row = Integer.parseInt(reader.readLine());
        int column = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[row][column];
        System.out.println("input value in matrix :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());

            }
            System.out.println(Arrays.deepToString(matrix));
        }
        int[][] transposing = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposing[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(transposing));

    }

}

