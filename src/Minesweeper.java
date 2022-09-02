
public class Minesweeper {

    private final String[] input;

    public Minesweeper (String[] input) {
        this.input = input;
    }

    public String[] getHints() {

        String[] field = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            field[i] = "0";
        }

        return field;
    }

}
