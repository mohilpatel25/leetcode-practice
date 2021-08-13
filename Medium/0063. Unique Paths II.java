/*
Problem Name: 63. Unique Paths II
Problem Link: https://leetcode.com/problems/unique-paths-ii/
Difficulty: Medium
*/
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 && j == 0 && obstacleGrid[i][j] == 0)
                    dp[i][j] = 1;
                else if(i == 0 && obstacleGrid[i][j] == 0)
                    dp[i][j] = dp[i][j-1];
                else if(j == 0 && obstacleGrid[i][j] == 0)
                    dp[i][j] = dp[i-1][j];
                else if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
