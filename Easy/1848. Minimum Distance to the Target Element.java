/*
Problem Name: 1848. Minimum Distance to the Target Element
Problem Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
Difficulty: Easy
*/
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE, n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == target)
                minDist = Math.min(minDist, Math.abs(i - start));
        }
        return minDist;
    }
}
