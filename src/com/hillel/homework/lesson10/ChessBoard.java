package com.hillel.homework.lesson10;

public class ChessBoard {
    public static void main(String[] args) {
        int rows = 8;
        int columns = 8;
        String[][] chessBoard = new String[rows][columns];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 != 1 && j % 2 != 0 || i % 2 != 0 && j % 2 != 1) {
                    chessBoard[i][j] = "W";

                } else {
                    chessBoard[i][j] = "B";
                }

                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }

    }
}
