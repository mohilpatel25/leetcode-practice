/*
Problem Name: 11. Container With Most Water
Problem Link: https://leetcode.com/problems/container-with-most-water/
Difficulty: Medium
*/
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max = 0;
        for(;l<=r;){
            max = Math.max(max, (r - l)*Math.min(height[l], height[r]));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
