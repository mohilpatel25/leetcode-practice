/*
Problem Name: 14. Longest Common Prefix
Problem Link: https://leetcode.com/problems/longest-common-prefix/
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        String lcp = strs[0];
        for(String s:strs){
            int n = Math.min(s.length(), lcp.length()), ind = 0;
            for(;ind < n && s.charAt(ind) == lcp.charAt(ind);ind++);
            lcp = lcp.substring(0,ind);
        }
        return lcp;
    }
}
