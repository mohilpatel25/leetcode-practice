/*
Problem Name: 1837. Sum of Digits in Base K
Problem Link: https://leetcode.com/problems/sum-of-digits-in-base-k/
Difficulty: Easy
*/
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while(n >= k){
            sum += n%k;
            n /= k;
        }
        sum += n;
        return sum;
    }
}
