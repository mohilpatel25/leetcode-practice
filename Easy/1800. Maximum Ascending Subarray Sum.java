/*
Problem Name: 1800. Maximum Ascending Subarray Sum
Problem Link: https://leetcode.com/problems/maximum-ascending-subarray-sum/
*/
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length, sum = nums[0], runSum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1] >= nums[i]){
                sum = Math.max(sum, runSum);
                runSum = 0;
            }
            runSum += nums[i];
        }
        sum = Math.max(sum, runSum);
        return sum;
    }
}
