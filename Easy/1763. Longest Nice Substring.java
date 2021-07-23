/*
Problem Name: 1763. Longest Nice Substring
Problem Link: https://leetcode.com/problems/longest-nice-substring/
*/
class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "", substr = "";
        for(int i=0;i<n;i++){
            for(int j=i+2;j<=n;j++){
                substr = s.substring(i, j);
                if(niceSubstring(substr)){
                    if(substr.length() > ans.length()){
                        ans = substr;
                    }
                }
            }
        }
        return ans;
    }
    static boolean niceSubstring(String s){
        int upper[] = new int[26], lower[] = new int[26];
        for(char c: s.toCharArray()){
            if(c >= 'A' && c <= 'Z')
                upper[c - 'A'] = 1;
            if(c >= 'a' && c <= 'z')
                lower[c - 'a'] = 1;
        }
        for(int i=0;i<26;i++)
            if(lower[i] != upper[i])
                return false;
        return true;
    }
}
