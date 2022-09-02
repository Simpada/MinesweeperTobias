import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Minesweeper {

    private final String[] input;

    public Minesweeper (String[] input) {
        this.input = input;
    }

    public String[] getHints() {


        return input;
    }

}
