import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinesweeperTest {

    @Test
    public void testOneCell() {
        assertArrayEquals(
                new String[]{"0"},
                new Minesweeper(new String[]{"."}).getHints()
        );
    }

    @Test
    public void testTwoRows() {
        assertArrayEquals(
                new String[]{"0", "0"},
                new Minesweeper(new String[]{".", "."}).getHints()
        );
    }

    @Test
    public void testTwoColumns() {
        assertArrayEquals(
                new String[]{"00"},
                new Minesweeper(new String[]{".."}).getHints()
        );
    }

    @Test
    public void testOneBomb() {
        assertArrayEquals(
                new String[]{"*"},
                new Minesweeper(new String[]{"*"}).getHints()
        );
    }

    @Test
    public void testDetectOneBomb() {
        assertArrayEquals(
                new String[]{"*1"},
                new Minesweeper(new String[]{"*."}).getHints()
        );
    }

    @Test
    public void testDetectTwoBombs() {
        assertArrayEquals(
                new String[]{"*2*"},
                new Minesweeper(new String[]{"*.*"}).getHints()
        );
    }

    @Test
    public void testSeveralBombs() {
        assertArrayEquals(
                new String[]{"*3*", "3*3", "*3*"},
                new Minesweeper(new String[]{"*.*", ".*.", "*.*"}).getHints()
        );
    }

    @Test
    void shouldDisplayMinefield() {
        assertArrayEquals(
                new String[]{
                        "02**2*100",
                        "02*432100",
                        "0112*1000",
                        "000222000",
                        "0001*1000",
                        "000123210",
                        "00001**20",
                        "111013*20",
                        "1*1001110"
                },
                new Minesweeper(new String[]{
                        "..**.*...",
                        "..*......",
                        "....*....",
                        ".........",
                        "....*....",
                        ".........",
                        ".....**..",
                        "......*..",
                        ".*......."
                }).getHints()
        );
    }

    private String[] random(int rows, int columns, int bombCount) {
        Random random = new Random();
        int numOfBombs = bombCount;

        if (numOfBombs > rows * columns) {
            numOfBombs = rows * columns;
        }

        String[] board = new String[rows];

        while (numOfBombs > 0) {
            for (int r = 0; r < board.length; r++) {
                if (board[r] == null) {
                    board[r] = "";
                    for (int c = 0; c < columns; c++) {
                        board[r] += ".";
                    }
                }
                int[] bombPositions = new int[columns];

                for (int c = 0; c < columns; c++) {
                    if (numOfBombs <= 0) break;

                    if (board[r].charAt(c) != '*') {
                        int bombChance = random.nextInt(100);
                        if (bombChance > 95) {
                            bombPositions[c] = 1;
                            numOfBombs--;
                        }
                    }
                }
                board[r] = replace(bombPositions, board[r]);
            }

        }
        return board;
    }

    public String replace(int[] position, String input) {
        char[] charArray = input.toCharArray();
        String newRow = "";

        for (int i = 0; i < charArray.length; i++) {
            if (position[i] == 0) {
                newRow += charArray[i];
            } else {
                newRow += "*";
            }
        }
        return newRow;
    }


    @Test
    public void testRandom() {
        String[] testBoard = random(20, 30, 120);

        for (int i = 0; i < testBoard.length; i++) {
            System.out.println(testBoard[i]);
        }

        System.out.println();

        testBoard = new Minesweeper(testBoard).getHints();
        for (int i = 0; i < testBoard.length; i++) {
            System.out.println(testBoard[i]);
        }
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = new int[10];


        System.out.println(emptyArray);
    }


}




















