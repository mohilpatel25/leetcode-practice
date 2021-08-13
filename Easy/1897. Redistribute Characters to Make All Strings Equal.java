/*
Problem Name: 1897. Redistribute Characters to Make All Strings Equal
Problem Link: https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/
Difficulty: Easy
*/
class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int count[] = new int[26];
        for(int i=0;i<n;i++){
            for(char c: words[i].toCharArray())
                count[c - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]%n != 0)
                return false;
        }
        return true;
    }
}
