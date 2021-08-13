/*
Problem Name: 1720. Decode XORed Array
Problem Link: https://leetcode.com/problems/decode-xored-array/
Difficulty: Easy
*/
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length, decoded[] = new int[n+1];
        decoded[0] = first;
        for(int i=0;i<n;i++){
            decoded[i+1] = decoded[i]^encoded[i];
        }
        return decoded;
    }
}
