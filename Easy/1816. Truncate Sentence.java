/*
Problem Name: 1816. Truncate Sentence
Problem Link: https://leetcode.com/problems/truncate-sentence/
Difficulty: Easy
*/
class Solution {
    public String truncateSentence(String s, int k) {
        int index = 0;
        for(char c: s.toCharArray()){
            if(c == ' ')
                k--;
            if(k == 0)
                break;
            index++;
        }
        return s.substring(0, index);
    }
}
