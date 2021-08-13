/*
Problem Name: 70. Climbing Stairs
Problem Link: https://leetcode.com/problems/climbing-stairs/
Difficulty: Easy
*/
class Solution {
    public int climbStairs(int n) {
        int steps[] = new int[3];
        steps[0] = 1;
        steps[1] = 2;
        if(n <= 2)
            return steps[n-1];
        for(int i=2;i<n;i++){
            steps[2] = steps[0] + steps[1];
            steps[0] = steps[1];
            steps[1] = steps[2];
        }
        return steps[2];
    }
}
