/*
Problem Name: 172. Factorial Trailing Zeroes
Problem Link: https://leetcode.com/problems/factorial-trailing-zeroes/
*/
class Solution {
    public int trailingZeroes(int n) {
        int zeros = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp%5 == 0){
                zeros++;
                temp /= 5;
            }
        }
        return zeros;
    }
}
