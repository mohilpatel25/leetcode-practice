/*
Problem Name: 42. Trapping Rain Water
Problem Link: https://leetcode.com/problems/trapping-rain-water/
Difficulty: Hard
*/
class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int n = height.length, left[] = new int[n], right[] = new int[n], max;
        left[0] = height[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], height[i]);
        }
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += Math.max(Math.min(left[i],right[i]) - height[i], 0);
        return sum;
    }
}
