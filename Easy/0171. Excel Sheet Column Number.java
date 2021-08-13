/*
Problem Name: 171. Excel Sheet Column Number
Problem Link: https://leetcode.com/problems/excel-sheet-column-number/
Difficulty: Easy
*/
class Solution {
    public int titleToNumber(String s) {
        int column = 0;
        for(char c: s.toCharArray())
            column = column*26 + (c - 'A') + 1;
        return column;
    }
}
