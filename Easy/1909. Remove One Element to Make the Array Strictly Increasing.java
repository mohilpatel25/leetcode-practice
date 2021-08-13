/*
Problem Name: 1909. Remove One Element to Make the Array Strictly Increasing
Problem Link: https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
*/
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length, index = -1;
        for(int i=1;i<n;i++){
            if(nums[i-1] >= nums[i]){
                if(index != -1)
                    return false;
                else
                    index = i;
            }
        }
        if(index <= 1 || index > n - 2)
            return true;
        return nums[index - 2] < nums[index] || nums[index - 1] < nums[index + 1];
    }
}
