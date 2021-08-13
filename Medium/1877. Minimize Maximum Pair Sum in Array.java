/*
Problem Name: 1877. Minimize Maximum Pair Sum in Array
Problem Link: https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
*/
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, max = 0;
        for(int i=0,j=n-1;i<j;i++,j--){
            max = Math.max(max, nums[i] + nums[j]);
        }
        return max;
    }
}
