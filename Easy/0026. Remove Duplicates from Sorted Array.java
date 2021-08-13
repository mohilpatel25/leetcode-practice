/*
Problem Name: 26. Remove Duplicates from Sorted Array
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Difficulty: Easy
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int cur_ind = 0, n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            while(i<n && nums[i] == num)
                i++;
            nums[cur_ind++] = num;
            i--;
        }
        return cur_ind;
    }
}
