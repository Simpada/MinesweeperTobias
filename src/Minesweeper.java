
public class Minesweeper {

    private final String[] input;

    public Minesweeper (String[] input) {
        this.input = input;
    }

    public String[] getHints() {

        String[] field = new String[input.length];

        for (int x = 0; x < input.length; x++) {
            field[x] = "";
            for (int y = 0; y < input[x].length(); y++) {
                if (input[x].equals("*")){
                    field[x] += "*";
                } else {
                    field[x] += "0";
                }
            }
        }

        return field;
    }

}
