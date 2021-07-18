/*
Problem Name: 27. Remove Element
Problem Link: https://leetcode.com/problems/remove-element/
*/
class Solution {
    public int removeElement(int[] nums, int val) {
        int curInd = 0, n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != val)
                nums[curInd++] = nums[i];
        }
        return curInd;
    }
}
