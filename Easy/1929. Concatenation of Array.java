/*
Problem Name: 1929. Concatenation of Array
Problem Link: https://leetcode.com/problems/concatenation-of-array/
*/
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length, ans[] = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
