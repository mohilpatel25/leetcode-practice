/*
Problem Name: 566. Reshape the Matrix
Problem Link: https://leetcode.com/problems/reshape-the-matrix/
*/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m*n != r*c)
            return mat;
        int newMat[][] = new int[r][c];
        for(int i=0;i<m*n;i++){
            newMat[i/c][i%c] = mat[i/n][i%n];
        }
        return newMat;
    }
}
