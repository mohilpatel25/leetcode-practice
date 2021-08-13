/*
Problem Name: 453. Minimum Moves to Equal Array Elements
Problem Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
Difficulty: Easy
*/
class Solution {
    public int minMoves(int[] nums) {
        int min = minimum(nums), n = nums.length;
        int moves = 0;
        for(int i=0;i<n;i++)
            moves += nums[i] - min;
        return moves;
    }
    int minimum(int[] arr){
        int min = arr[0], n = arr.length;
        for(int i=1;i<n;i++)
            min = Math.min(min, arr[i]);
        return min;
    }
}
