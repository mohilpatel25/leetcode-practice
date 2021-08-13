/*
Problem Name: 1827. Minimum Operations to Make the Array Increasing
Problem Link: https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
Difficulty: Easy
*/
class Solution {
    public int minOperations(int[] nums) {
        int operations = 0, n = nums.length, diff = 0;
        for(int i=1;i<n;i++){
            if(nums[i-1] >= nums[i]){
                operations += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;                
            }
        }
        return operations;
    }
}
