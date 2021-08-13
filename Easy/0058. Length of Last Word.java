/*
Problem Name: 58. Length of Last Word
Problem Link: https://leetcode.com/problems/length-of-last-word/
Difficulty: Easy
*/
class Solution {
    public int lengthOfLastWord(String s) {
        int ind = s.length() - 1, end = s.length() - 1;
        while(ind >= 0 && s.charAt(ind) == ' ')
            ind--;
        end = ind;
        while(ind >= 0 && s.charAt(ind) != ' ')
            ind--;
        return end - ind;
    }
}
