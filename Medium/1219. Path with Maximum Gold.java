/*
Problem Name: 1219. Path with Maximum Gold
Problem Link: https://leetcode.com/problems/path-with-maximum-gold/
*/
class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0, rows = grid.length, cols = grid[0].length;
        boolean visited[][] = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] != 0)
                    maxGold = Math.max(maxGold, search(grid, visited, i, j));
            }
        }
        return maxGold;
    }
    int search(int[][] grid, boolean visited[][], int row, int col){
        if(grid[row][col] == 0)
            return 0;
        int gold = 0;
        visited[row][col] = true;
        if(row>0 && !visited[row-1][col])
            gold = Math.max(gold, search(grid, visited, row-1, col));
        if(row<grid.length-1 && !visited[row+1][col])
            gold = Math.max(gold, search(grid, visited, row+1, col));
        if(col>0 && !visited[row][col-1])
            gold = Math.max(gold, search(grid, visited, row, col-1));
        if(col<grid[0].length-1 && !visited[row][col+1])
            gold = Math.max(gold, search(grid, visited, row, col+1));
        visited[row][col] = false;
        return gold + grid[row][col];
    }
}
