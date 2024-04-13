package board;

import java.util.Random;

public class Game {
    private static int ROWS = 9;
    private static int COLUMNS = 9;
    private NumberBoard[][] numbers;

    public Game() {
        numbers = new NumberBoard[COLUMNS][ROWS];
    }

    public NumberBoard[][] getNumbers() {
        return numbers;
    }

    public void initializeNumbers() {
        for (int i = 0; i < COLUMNS; i++) {
            for (int j = 0; j < ROWS; j++) {
                numbers[i][j] = new NumberBoard(randomNumber(), true);
            }
        }
    }

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, 9);
    }

    private void validateRepeats() {

    }

    private void validateColumn() {

    }

    private void validateRow() {

    }

    private void validateSquare() {

    }
}
