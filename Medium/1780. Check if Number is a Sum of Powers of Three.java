/*
Problem Name: 1780. Check if Number is a Sum of Powers of Three
Problem Link: https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
Difficulty: Medium
*/
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n >= 3){
            if(n%3 == 2)
                return false;
            n /= 3;
        }
        return n == 1 ? true : false;
    }
}
