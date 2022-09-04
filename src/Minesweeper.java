
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
                    field[row] += getBombCounter(row, column);
                }
            }
        }
        return field;
    }

    private int getBombCounter(int row, int column) {
        int bombCounter = 0;

        for (int r = row -1; r <= row +1; r++) {
            for (int c = column -1; c <= column +1; c++) {
                if (detectBomb(r, c)) {
                    bombCounter++;
                }
            }
        }
        return bombCounter;

        /*
        if(detectBomb(row -1, column -1)) bombCounter++;
        if(detectBomb(row -1, column)) bombCounter++;
        if(detectBomb(row -1, column +1)) bombCounter++;
        if(detectBomb(row, column -1)) bombCounter++;
        if(detectBomb(row, column +1)) bombCounter++;
        if(detectBomb(row +1, column -1)) bombCounter++;
        if(detectBomb(row +1, column)) bombCounter++;
        if(detectBomb(row +1, column +1)) bombCounter++;
        */
    }

    private boolean detectBomb(int row, int column) {

         if (row < 0 || row >= input.length) {
             return false;
         }
         if (column < 0 || column >= input[row].length()) {
             return false;
         }

         return input[row].charAt(column) == '*';

    }
}
