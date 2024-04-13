package services;

public class UI {
    private static int GRID_ROWS = 9;
    private static int GRID_COLUMNS = 9;

    public static void printGrid() {
        for (int i = 0 ; i < GRID_COLUMNS ; i++) {
            printRows(i);
            createDivison(i);
        }
        System.out.println("   a   b   c   d   e   f   g   h   i");
    }
    private static void printRows(int row) {
        System.out.print(row + "|");
        for (int i = 0 ; i < GRID_ROWS ; i++) {
            System.out.print(" - ");
            if (isSpecialDivision(i)) {
                System.out.print("║");
            }
            else {
                System.out.print("|");
            }
        }
    }

    private static void createDivison(int index) {
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
