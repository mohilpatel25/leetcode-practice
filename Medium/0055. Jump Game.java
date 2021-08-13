/*
Problem Name: 55. Jump Game
Problem Link: https://leetcode.com/problems/jump-game/
Difficulty: Medium
*/
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length, maxIndex = n - 1;
        for(int i=n-1;i>=0;i--){
            if(i + nums[i] >= maxIndex)
                maxIndex = i;
        }
        return maxIndex == 0;
    }
}
