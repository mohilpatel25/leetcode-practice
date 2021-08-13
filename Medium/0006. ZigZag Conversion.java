/*
Problem Name: 6. ZigZag Conversion
Problem Link: https://leetcode.com/problems/zigzag-conversion/
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int n = s.length();
        char arr[][] = new char[numRows][n];
        int r=0, c=0, dr = 1, dc = 0;
        for(int i=0;i<n;i++){
            arr[r][c] = s.charAt(i);
            r += dr;
            c += dc;
            if(r == numRows){
                r -= dr;
                c -= dc;
                dr = -1;
                dc = 1;
                r += dr;
                c += dc;
            }
            else if(r < 0){
                r -= dr;
                c -= dc;
                dr = 1;
                dc = 0;
                r += dr;
                c += dc;
            }
        }
        s = "";
        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++)
                if(arr[i][j] != '\0')
                    s += arr[i][j];
        }
        return s;
    }
}
