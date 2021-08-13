/*
Problem Name: 168. Excel Sheet Column Title
Problem Link: https://leetcode.com/problems/excel-sheet-column-title/
*/
class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        for(;n>0;){
            n--;
            ans = (char)(n%26 + 'A') + ans;
            n /= 26;
        }
        return ans;
    }
}
