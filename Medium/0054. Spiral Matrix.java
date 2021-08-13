/*
Problem Name: 54. Spiral Matrix
Problem Link: https://leetcode.com/problems/spiral-matrix/
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int dirh[] = {0,1,0,-1}, dirv[] = {1,0,-1,0};
        int m = matrix.length, n = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();
        boolean visited[][] = new boolean[m][n];
        int r = 0, c = 0, itr = 0;
        for(int i=0;i<m*n;i++){
            while(r >= 0 && r < m && c >=0 && c < n && !visited[r][c]){
                visited[r][c] = true;
                list.add(matrix[r][c]);
                r += dirh[itr];
                c += dirv[itr];
            }
            switch(itr){
                case 0: c --;r++; break;
                case 1: r --;c--; break;
                case 2: c ++;r--; break;
                case 3: r ++;c++; break;
            }
            itr = (itr + 1)%4;
        }
        return list;
    }
}
