package org.com.ds.backtracking;

public class RatInMaze {

    public static void main(String[] args) {

        int maze[][] = {
                            {1, 1, 0, 0},
                            {1, 1, 0 ,1},
                            {1, 1, 0, 0},
                            {0, 1, 1, 1}
                        };
        int n = maze.length;
        int[][] solved = new int[n][n];
        solveTheMaze(maze, 0, 0, solved, n);
    }

    private static boolean solveTheMaze(int[][] maze, int x, int y, int[][] solved, int n) {

        if(x==n-1 && y==n-1 && maze[x][y]==1){
            solved[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y, n)){
            solved[x][y] = 1;

            if(solveTheMaze(maze, x+1, y, solved, n)){
                return true;
            }
            if(solveTheMaze(maze, x, y+1, solved, n)){
                return true;
            }

            //backtrack
            solved[x][y] = 0;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y, int n) {

        return x>=0 && x<n && y>=0 && y<n && maze[x][x]==1;
    }
}