/*
Problem Name: 1880. Check if Word Equals Summation of Two Words
Problem Link: https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
*/
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (value(firstWord) + value(secondWord)) == value(targetWord);
    }
    static int value(String s){
        StringBuilder num = new StringBuilder();
        for(char c: s.toCharArray())
            num.append(c - 'a');
        return Integer.parseInt(num.toString());
    }
}
