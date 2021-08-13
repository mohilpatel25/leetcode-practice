/*
Problem Name: 1551. Minimum Operations to Make Array Equal
Problem Link: https://leetcode.com/problems/minimum-operations-to-make-array-equal/
Difficulty: Medium
*/
class Solution {
    public int minOperations(int n) {
        return (n%2 == 0) ? (n/2)*(4 + (n/2-1)*4)/4 : (n/2)*(8 + (n/2-1)*4)/4;
    }
}
