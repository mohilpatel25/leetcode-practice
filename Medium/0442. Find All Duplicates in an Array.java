/*
Problem Name: 442. Find All Duplicates in an Array
Problem Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
Difficulty: Medium
*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                list.add(index+1);
            if(nums[index] > 0)
                nums[index] = -nums[index];
        }
        return list;
    }
}
