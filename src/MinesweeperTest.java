import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinesweeperTest {


    @Test
    public void testOneCell() {
        assertEquals(
            new String[]{"0"},
            new Minesweeper(new String[]{"."}).getHints()
        );
    }
}
