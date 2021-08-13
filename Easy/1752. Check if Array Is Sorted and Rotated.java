/*
Problem Name: 1752. Check if Array Is Sorted and Rotated
Problem Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
*/
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        if(n <= 2)
            return true;
        if(nums[0] < nums[n-1]){
            return checkAscending(nums, 0 , n-1);
        }
        int mid = 1;
        for(;mid<n;mid++){
            if(nums[mid - 1] > nums[mid]){
                break;
            }
        }
        return checkAscending(nums, mid, n-1) && checkAscending(nums, 0, mid-1);
    }
    boolean checkAscending(int nums[], int l, int r){
        int n = nums.length;
        for(int i=l+1;i<=r;i++){
            if(nums[i - 1] > nums[i])
                return false;
        }
        return true;
    }
}
