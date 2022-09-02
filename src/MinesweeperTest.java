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
    public void testTwoCell() {
        assertArrayEquals(
                new String[]{"0", "0"},
                new Minesweeper(new String[]{".", "."}).getHints()
        );
    }


}
