/*
Problem Name: 1685. Sum of Absolute Differences in a Sorted Array
Problem Link: https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
*/
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0, n = nums.length;
        int prefix[] = new int[n], suffix[] = new int[n], answer[] = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
            prefix[i] = prefix[i-1] + nums[i];
        for(int i=n-2;i>=0;i--)
            suffix[i] = suffix[i+1] + nums[i];
        for(int i=0;i<n;i++){
            answer[i] = i*nums[i] - prefix[i] + suffix[i] - (n-i-1)*nums[i];
        }
        return answer;
    }
}
