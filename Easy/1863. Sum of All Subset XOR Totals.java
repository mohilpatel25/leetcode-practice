/*
Problem Name: 1863. Sum of All Subset XOR Totals
Problem Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/
Difficulty: Easy
*/
class Solution {
    public int subsetXORSum(int[] nums) {        
        return sum(nums, 0, 0);
    }
    int sum(int[] nums, int cur, int xor){
        if(cur == nums.length)
            return xor;
        return sum(nums, cur+1, xor^nums[cur]) + sum(nums, cur+1, xor);
    }
}
