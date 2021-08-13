/*
Problem Name: 217. Contains Duplicate
Problem Link: https://leetcode.com/problems/contains-duplicate/
Difficulty: Easy
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            if(set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }
}
