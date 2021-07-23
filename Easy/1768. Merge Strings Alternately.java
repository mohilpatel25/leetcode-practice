/*
Problem Name: 1768. Merge Strings Alternately
Problem Link: https://leetcode.com/problems/merge-strings-alternately/
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length(), i, j;
        char arr1[] = word1.toCharArray(), arr2[] = word2.toCharArray();
        String ans = "";
        for(i=0, j=0;i<l1 && j<l2;){
            if((i+j)%2 == 0){
                ans += arr1[i];
                i++;
            }
            else{
                ans += arr2[j];
                j++;
            }
        }
        for(;i<l1;i++)
            ans += arr1[i];
        for(;j<l2;j++)
            ans += arr2[j];
        return ans;
    }
}
