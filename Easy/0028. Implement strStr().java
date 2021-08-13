/*
Problem Name: 28. Implement strStr()
Problem Link: https://leetcode.com/problems/implement-strstr/
Difficulty: Easy
*/
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if(m == 0)
            return 0;
        if(n == m){
            if(haystack.equals(needle)) return 0;
            else    return -1;
        }
        if(n < m)
            return -1;
        for(int i=0;i<n-m+1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j;
                for(j=0;j<m;j++){
                    if(haystack.charAt(i+j) != needle.charAt(j))
                        break;
                }
                if(j == m)
                    return i;
            }
        }
        return -1;
    }
}
