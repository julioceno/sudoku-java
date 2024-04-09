package services;

public class UI {
    private static int GRID_ROWS = 9;
    private static int GRID_COLUMNS = 9;

    public static void printGrid() {
        for (int i = 0 ; i < GRID_COLUMNS ; i++) {
            printRows(i + 1);
            createDivison(i + 1);
        }
        System.out.println("   a   b   c   d   e   f   g   h   i");
    }
    private static void printRows(int row) {
        System.out.print(row + "|");
        for (int i = 0 ; i < GRID_ROWS ; i++) {
            System.out.print(" - ");
            System.out.print("|");
            if (i == 2) {
                System.out.print("|");
            }

            if (i == 5) {
                System.out.print("|");
            }
        }
    }

    private static void createDivison(int row) {
        System.out.println("");
        System.out.print("  ");
        for (int i = 0 ; i < GRID_ROWS; i++) {
            if (row == 3) {
                System.out.print(" ═  ");
            }
            else if (row == 6) {
                System.out.print(" ═  ");
            }
            else {
                System.out.print(" ─  ");
            }
        }
        System.out.println("");
    }

    private static boolean isSpecialDivision(int currentIndex) {
        return true;
    }
}
