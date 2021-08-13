/*
Problem Name: 191. Number of 1 Bits
Problem Link: https://leetcode.com/problems/number-of-1-bits/
Difficulty: Easy
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        for(int i=0;i<32;i++){
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt;
    }
}
