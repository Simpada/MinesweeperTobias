import org.junit.jupiter.api.Test;

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

}
