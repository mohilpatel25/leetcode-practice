/*
Problem Name: 1332. Remove Palindromic Subsequences
Problem Link: https://leetcode.com/problems/remove-palindromic-subsequences/
*/
class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0)
            return s.length();
        for(int l=0, r=s.length()-1;l<=r;l++,r--){
            if(s.charAt(l) != s.charAt(r))
                return 2;
        }
        return 1;
    }
}
