/*
Problem Name: 1796. Second Largest Digit in a String
Problem Link: https://leetcode.com/problems/second-largest-digit-in-a-string/
Difficulty: Easy
*/
class Solution {
    public int secondHighest(String s) {
        int max = -1, secondMax = -1;
        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9'){
                if(max == c - '0')
                    continue;
                else if(max < c - '0'){
                    secondMax = max;
                    max = c - '0';
                }
                else if(secondMax < c - '0'){
                    secondMax = c - '0';
                }
            }
        }
        return secondMax;
    }
}
