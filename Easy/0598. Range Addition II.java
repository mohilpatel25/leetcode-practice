/*
Problem Name: 598. Range Addition II
Problem Link: https://leetcode.com/problems/range-addition-ii/
*/
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minM = m, minN = n, l = ops.length;
        for(int i=0;i<l;i++){
            minM = Math.min(minM,ops[i][0]);
            minN = Math.min(minN,ops[i][1]);
        }
        return minM*minN;
    }
}
