package model;

import java.util.Arrays;

public class TicTacToeBoard implements Board {
    String[][] cell;

    public TicTacToeBoard() {
        cell = new String[3][3];
    }

    public void setCell(int row, int col, String symbol) {
        cell[row][col] = symbol;
    }

    public String getCell(int row, int col) {
        return cell[row][col];
    }

    @Override
    public Board move() {
        return null;
    }

    @Override
    public Board copy() {
        return null;
    }

    @Override
    public ResultSet isCompleted() {
        return null;
    }

    @Override
    public String toString(){
        return "TicTacToeBoard{" +
                "cell=" + Arrays.deepToString(cell);
    }



}
