/*
Problem Name: 1668. Maximum Repeating Substring
Problem Link: https://leetcode.com/problems/maximum-repeating-substring/
*/
class Solution {
    public int maxRepeating(String sequence, String word) {
        String kword = word;
        int count = 0;
        while(sequence.contains(kword)){
            kword += word;
            count++;
        }
        return count;
    }
}
