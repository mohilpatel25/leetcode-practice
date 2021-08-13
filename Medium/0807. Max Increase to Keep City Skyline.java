/*
Problem Name: 807. Max Increase to Keep City Skyline
Problem Link: https://leetcode.com/problems/max-increase-to-keep-city-skyline/
Difficulty: Medium
*/
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int rowLine[] = new int[rows], colLine[] = new int[cols];
        for(int i=0;i<rows;i++){
            int max = 0;
            for(int j=0;j<cols;j++){
                max = Math.max(max, grid[i][j]);
            }
            rowLine[i] = max;
        }
        for(int i=0;i<cols;i++){
            int max = 0;
            for(int j=0;j<rows;j++){
                max = Math.max(max, grid[j][i]);
            }
            colLine[i] = max;
        }
        int increase = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                increase += Math.min(rowLine[i], colLine[j]) - grid[i][j];
            }
        }
        return increase;
    }
}
