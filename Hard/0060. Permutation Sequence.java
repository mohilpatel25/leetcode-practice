/*
Problem Name: 60. Permutation Sequence
Problem Link: https://leetcode.com/problems/permutation-sequence/
Difficulty: Hard
*/
class Solution {
    String ans = "";
    int kth = 0;
    public String getPermutation(int n, int k) {
        kth = k;
        generate("", new boolean[n], n);
        return ans;
    }
    void generate(String permutation, boolean[] v, int n){
        if(permutation.length() >= n){
            if(kth == 1)
                ans = permutation;
            kth--;
            return;
        }
        for(int i=0;i<n;i++){
            if(!v[i] && ans.length() == 0){
                v[i] = true;
                generate(permutation + (i+1), v, n);
                v[i] = false;
            }
        }
    }
}
