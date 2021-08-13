/*
Problem Name: 1844. Replace All Digits with Characters
Problem Link: https://leetcode.com/problems/replace-all-digits-with-characters/
Difficulty: Easy
*/
class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder shifted = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2 == 0)
                shifted.append(s.charAt(i));
            else
                shifted.append(shift(s.charAt(i-1), s.charAt(i) - '0'));
        }
        return shifted.toString();
    }
    char shift(char c, int x){
        return (char)(((c - 'a') + x%26)%26 + 'a');
    }
}
