/*
Problem Name: 1920. Build Array from Permutation
Problem Link: https://leetcode.com/problems/build-array-from-permutation/
*/
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length, ans[] = new int[n];
        for(int i=0;i<n;i++)
            ans[i] = nums[nums[i]];
        return ans;
    }
}
