package services;

import board.NumberBoard;
import enums.Color;

public class UI {
    private static int GRID_ROWS = 9;

    public static void printGrid(NumberBoard[][] matrixNumbers) {
        for (int i = 0 ; i < matrixNumbers.length ; i++) {
            printRows(i, matrixNumbers[i]);
            printDivision(i);
        }
        System.out.println("   a   b   c   d   e   f   g   h   i");
    }

    private static void printRows(int row, NumberBoard[] numberBoard) {
        System.out.print(row + "|");
        for (int i = 0 ; i < numberBoard.length ; i++) {
            NumberBoard number = numberBoard[i];
            Integer value = number.getValue();

            if (value != null) {
                if (number.getSpecial()) {
                    System.out.print(Color.WHITE_BOLD_BRIGHT);
                    System.out.print(" " + value + " ");
                    System.out.print(Color.RESET);
                }
                else {
                    System.out.print(" " + value + " ");
                }
            }
            else {
                System.out.print(" - ");
            }

            if (isSpecialDivision(i)) {
                System.out.print("║");
            }
            else {
                System.out.print("|");
            }
        }
    }

    private static void printDivision(int index) {
        System.out.println("");
        System.out.print("  ");
        for (int i = 0 ; i < GRID_ROWS; i++) {
            if (isSpecialDivision(index)) {
                System.out.print(" ══ ");
            }
            else {
                System.out.print(" ─  ");
            }
        }
        System.out.println("");
    }

    private static boolean isSpecialDivision(int index) {
        if (index == 2 || index == 5) return true;
        return false;
    }
}
