/*
Problem Name: 541. Reverse String II
Problem Link: https://leetcode.com/problems/reverse-string-ii/
*/
class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char arr[] = s.toCharArray();
        for(int i=0;i<n;i+=2*k){
            for(int l=i,r=Math.min(i+k,n)-1;l<r;l++,r--){
                char c = arr[l];
                arr[l]= arr[r];
                arr[r] = c;
            }
        }
        return new String(arr);
    }
}
