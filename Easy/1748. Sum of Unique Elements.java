/*
Problem Name: 1748. Sum of Unique Elements
Problem Link: https://leetcode.com/problems/sum-of-unique-elements/
Difficulty: Easy
*/
class Solution {
    public int sumOfUnique(int[] nums) {
        int count[] = new int[101];
        for(int n: nums)
            count[n]++;
        int sum = 0;
        for(int i=0;i<=100;i++){
            if(count[i] == 1)
                sum += i;
        }
        return sum;
    }
}
