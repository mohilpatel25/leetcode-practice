/*
Problem Name: 1829. Maximum XOR for Each Query
Problem Link: https://leetcode.com/problems/maximum-xor-for-each-query/
*/
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length, max = (int)Math.pow(2, maximumBit) - 1;
        for(int i=1;i<n;i++)
            nums[i] ^= nums[i-1];
        int answer[] = new int[n];
        for(int i=0;i<n;i++){
            answer[n - 1 - i] = nums[i]^max;
        }
        return answer;
    }
}
