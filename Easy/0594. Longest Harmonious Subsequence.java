/*
Problem Name: 594. Longest Harmonious Subsequence
Problem Link: https://leetcode.com/problems/longest-harmonious-subsequence/
Difficulty: Easy
*/
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        for(int i=0;i<n;i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        int lhs = 0;
        for(int k: map.keySet()){
            if(map.containsKey(k+1))
                lhs = Math.max(lhs, map.get(k) + map.get(k+1));
        }
        return lhs;
    }
}
