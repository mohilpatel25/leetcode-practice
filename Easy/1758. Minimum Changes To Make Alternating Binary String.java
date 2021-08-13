/*
Problem Name: 1758. Minimum Changes To Make Alternating Binary String
Problem Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
*/
class Solution {
    public int minOperations(String s) {
        int count[] = new int[2], s1 = 0, s2 = 1;
        for(char c: s.toCharArray()){
            if((c-'0') != s1)
                count[0]++;
            if((c-'0') != s2)
                count[1]++;
            s1 ^= 1;
            s2 ^= 1;
        }
        return Math.min(count[0], count[1]);
    }
}
