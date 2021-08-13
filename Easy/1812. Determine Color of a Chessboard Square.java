/*
Problem Name: 1812. Determine Color of a Chessboard Square
Problem Link: https://leetcode.com/problems/determine-color-of-a-chessboard-square/
*/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a') + (coordinates.charAt(1) - '1'))%2 == 0 ? false : true;
    }
}
