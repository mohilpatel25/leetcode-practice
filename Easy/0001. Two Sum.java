/*
Problem Name: 1. Two Sum
Problem Link: https://leetcode.com/problems/two-sum/
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target - nums[i]))
                return new int[]{i,map.get(target - nums[i])};
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
