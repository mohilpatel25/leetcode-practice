/*
Problem Name: 231. Power of Two
Problem Link: https://leetcode.com/problems/power-of-two/
Difficulty: Easy
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0 && n > 0;
    }
}
