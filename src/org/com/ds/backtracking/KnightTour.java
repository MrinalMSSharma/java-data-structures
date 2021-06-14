package org.com.ds.backtracking;

public class KnightTour {

    private static int[] pathRow = {1, 1, -1, -1, 2, 2, -2, -2};
    private static int[] colRow = {2, -2, 2, -2, 1, -1, 1, -1};

    public static void main(String[] args) {

        int[][] board = {
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0, 0, 0, 0}
                        };
        knightTour(board, 0, 0, 0);
    }

    private static boolean knightTour(int[][] board, int row, int col, int step) {

        if(step == 63){
            return true;
        }
        for (int i = 0; i < pathRow.length; i++) {
            int newRow = row + pathRow[i];
            int newCol = col + colRow[i];

            if(validMove(board, newRow, newCol)){
                step++;
                board[newRow][newCol] = step;

                if(knightTour(board, newRow, newCol, step)){
                    return true;
                }
                //backtrack
                board[newRow][newCol] = 0;
            }
        }
        return false;
    }

    private static boolean validMove(int[][] board, int newRow, int newCol) {

        if(newRow>=0 && newRow<8 && newCol>=0 && newCol<8 && board[newRow][newCol]==0){
            return true;
        }
        return false;
    }
}