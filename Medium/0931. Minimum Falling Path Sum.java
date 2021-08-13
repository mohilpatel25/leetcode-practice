/*
Problem Name: 931. Minimum Falling Path Sum
Problem Link: https://leetcode.com/problems/minimum-falling-path-sum/
*/
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j == 0){
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                }
                else if(j == cols-1){
                    matrix[i][j] += Math.min(matrix[i-1][j-1], matrix[i-1][j]);
                }
                else{
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<cols;i++)
            min = Math.min(min, matrix[rows-1][i]);
        return min;
    }
}
