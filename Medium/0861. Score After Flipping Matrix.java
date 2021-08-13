/*
Problem Name: 861. Score After Flipping Matrix
Problem Link: https://leetcode.com/problems/score-after-flipping-matrix/
Difficulty: Medium
*/
class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        for(int i=0;i<rows;i++){
            if(grid[i][0] == 0)
                flipRow(grid, i);
        }
        for(int i=1;i<cols;i++){
            if(zerosMore(grid, i))
                flipCol(grid, i);
        }
        return calcScore(grid);
    }
    void flipRow(int[][] grid, int row){
        int cols = grid[0].length;
        for(int i=0;i<cols;i++){
            grid[row][i] ^= 1;
        }
    }
    void flipCol(int[][] grid, int col){
        int rows = grid.length;
        for(int i=0;i<rows;i++){
            grid[i][col] ^= 1;
        }
    }
    boolean zerosMore(int[][] grid, int col){
        int one = 0, rows = grid.length;
        for(int i=0;i<rows;i++)
            one += grid[i][col];
        return one > (rows - one) ? false : true;
    }
    int calcScore(int[][] grid){
        int score = 0, rows = grid.length, cols = grid[0].length;
        for(int i=0;i<rows;i++){
            int colScore = 0, pow = 1;
            for(int j=cols-1;j>=0;j--){
                colScore += grid[i][j]*pow;
                pow *= 2;
            }
            score += colScore;
            System.out.println(colScore);
        }
        return score;
    }
    void print(int[][] grid){
        int rows = grid.length, cols = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(grid[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
}
