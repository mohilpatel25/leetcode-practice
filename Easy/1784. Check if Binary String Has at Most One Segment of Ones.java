/*
Problem Name: 1784. Check if Binary String Has at Most One Segment of Ones
Problem Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
Difficulty: Easy
*/
class Solution {
    public boolean checkOnesSegment(String s) {
        int index = 0, n = s.length();
        while(index < n && s.charAt(index) != '1')
            index++;
        if(index == n)
            return true;
        while(index < n && s.charAt(index) == '1')
            index++;
        if(index == n)
            return true;
        while(index < n){
            if(s.charAt(index) == '1')
                return false;
            index++;
        }
        return true;
    }
}
