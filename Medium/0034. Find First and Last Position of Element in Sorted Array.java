/*
Problem Name: 34. Find First and Last Position of Element in Sorted Array
Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Difficulty: Medium
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l, r, first;
        for(l=0,r=nums.length;l<r;){
            int mid = l + (r-l)/2;
            if(target <= nums[mid])
                r = mid;
            else
                l = mid + 1;
        }
        
        if(l == nums.length || nums[l] != target)
            return new int[]{-1,-1};
        first = l;
        for(l=0,r=nums.length;l<r;){
            int mid = l + (r-l)/2;
            if(target < nums[mid])
                r = mid;
            else
                l = mid + 1;
        }
        return new int[]{first, l-1};
    }
}
