/*
Problem Name: 542. 01 Matrix
Problem Link: https://leetcode.com/problems/01-matrix/
Difficulty: Medium
*/
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int distance[][] = new int[rows][cols];
        for(int[] r: distance)
            Arrays.fill(r, 100000);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j] == 0)
                    distance[i][j] = 0;
                else{
                    if(i > 0)
                        distance[i][j] = Math.min(distance[i][j], distance[i-1][j] + 1);
                    if(j > 0)
                        distance[i][j] = Math.min(distance[i][j], distance[i][j-1] + 1);
                }
            }
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(i < rows-1)
                    distance[i][j] = Math.min(distance[i][j], distance[i+1][j] + 1);
                if(j < cols-1)
                    distance[i][j] = Math.min(distance[i][j], distance[i][j+1] + 1);
            }
        }
        return distance;
    }
}
