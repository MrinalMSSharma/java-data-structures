package org.com.ds.backtracking;

public class NQueen {

    public static void main(String[] args) {

        int[][] board = {
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0},
                            {0, 0, 0, 0, 0}
                        };
        int n = board.length;
        saveTheQueen(board, 0, n);
    }

    private static boolean saveTheQueen(int[][] board, int col, int n) {

        if(col>=n){
            return true;
        }
        for (int row = 0; row < n; row++) {
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                if(saveTheQueen(board, col+1, n)){
                    return true;
                }
                //backtrack
                board[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int n) {

        int i, j = 0;
        for (i = 0; i < col; i++) {
            if(board[row][i] == 1){
                return false;
            }
        }
        for(i=row, j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(i=row; i>=n; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        return true;
    }
}