/*
Problem Name: 1329. Sort the Matrix Diagonally
Problem Link: https://leetcode.com/problems/sort-the-matrix-diagonally/
Difficulty: Medium
*/
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<rows;i++){
            list.clear();
            for(int r=i,c=0;r<rows && c<cols;r++,c++)
                list.add(mat[r][c]);
            Collections.sort(list);
            for(int r=i,c=0,k=0;r<rows && c<cols;r++,c++,k++)
                mat[r][c] = list.get(k);
        }
        for(int i=1;i<cols;i++){
            list.clear();
            for(int r=0,c=i;r<rows && c<cols;r++,c++)
                list.add(mat[r][c]);
            Collections.sort(list);
            for(int r=0,c=i,k=0;r<rows && c<cols;r++,c++,k++)
                mat[r][c] = list.get(k);
        }
        return mat;
    }
}
