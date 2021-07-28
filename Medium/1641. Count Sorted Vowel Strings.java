/*
Problem Name: 1641. Count Sorted Vowel Strings
Problem Link: https://leetcode.com/problems/count-sorted-vowel-strings/
*/
class Solution {
    public int countVowelStrings(int n) {
        int count[] = new int[]{1,1,1,1,1};
        for(int i=1;i<=n;i++){
            for(int j=3;j>=0;j--){
                count[j] += count[j+1];
            }
        }
        return count[0];
    }
}
