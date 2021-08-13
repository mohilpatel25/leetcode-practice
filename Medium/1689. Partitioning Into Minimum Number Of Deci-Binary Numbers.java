/*
Problem Name: 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
Problem Link: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
Difficulty: Medium
*/
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(char c: n.toCharArray())
            max = Math.max(max, c - '0');
        return max;
    }
}
