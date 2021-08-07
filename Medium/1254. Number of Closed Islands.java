/*
Problem Name: 1254. Number of Closed Islands
Problem Link: https://leetcode.com/problems/number-of-closed-islands/
*/
class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length, cols = grid[0].length, island = 0;
        boolean closed = false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                closed = false;
                if(grid[i][j] == 0)
                    closed = traverse(grid, i, j, rows, cols);
                if(closed){
                    island++;
                }
            }
        }
        return island;
    }
    boolean traverse(int[][] grid, int row, int col, int rows, int cols){
        if((row == 0) || (row == rows-1) || (col == 0) || (col == cols-1))
            return false;
        grid[row][col] = 1;
        boolean closed = true;
        if((row > 0) && (grid[row-1][col]) == 0)
            closed = closed & traverse(grid, row-1, col, rows, cols);
        if((row < rows-1) && (grid[row+1][col]) == 0)
            closed = closed & traverse(grid, row+1, col, rows, cols);
        if((col > 0) && (grid[row][col-1]) == 0)
            closed = closed & traverse(grid, row, col-1, rows, cols);
        if((col < cols-1) && (grid[row][col+1]) == 0)
            closed = closed & traverse(grid, row, col+1, rows, cols);
        return closed;
    }
}
