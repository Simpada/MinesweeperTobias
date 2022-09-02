
public class Minesweeper {

    private final String[] input;

    public Minesweeper (String[] input) {
        this.input = input;
    }

    public String[] getHints() {

        String[] field = new String[input.length];

        for (int row = 0; row < input.length; row++) {
            field[row] = "";
            for (int column = 0; column < input[row].length(); column++) {
                if (input[row].charAt(column) == '*'){
                    field[row] += "*";
                } else {
                    int numberOfBombs = 0;
                    if (column > 0) {
                        if (input[row].charAt(column - 1) == '*') {
                            numberOfBombs++;
                        }
                    }
                    field[row] += numberOfBombs;
                }
            }
        }

        return field;
    }



}
