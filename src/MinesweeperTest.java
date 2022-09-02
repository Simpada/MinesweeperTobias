import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinesweeperTest {

    @Test
    public void testOneRow() {
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

}
