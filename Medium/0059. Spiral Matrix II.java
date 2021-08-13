/*
Problem Name: 59. Spiral Matrix II
Problem Link: https://leetcode.com/problems/spiral-matrix-ii/
*/
class Solution {
    public int[][] generateMatrix(int n) {
        int dirh[] = {0,1,0,-1}, dirv[] = {1,0,-1,0}, r = 0, c = 0;
        boolean visited[][] = new boolean[n][n];
        int matrix[][] = new int[n][n], itr = 0;
        for(int i=0;i<n*n;i++){
            if(r >= 0 && c >= 0 && r < n && c < n && !visited[r][c]){
                matrix[r][c] = i + 1;
                visited[r][c] = true;
                r += dirh[itr];
                c += dirv[itr];
            }
            else{
                switch(itr){
                    case 0: c--; r++; break;
                    case 1: c--; r--; break;
                    case 2: c++; r--; break;
                    case 3: c++; r++; break;
                }
                itr = (itr + 1)%4;
                i--;
            }
        }
        return matrix;
    }
}
