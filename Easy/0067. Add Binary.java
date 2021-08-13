/*
Problem Name: 67. Add Binary
Problem Link: https://leetcode.com/problems/add-binary/
*/
class Solution {
    public String addBinary(String a, String b) {
        int indexa = a.length() - 1, indexb = b.length() - 1, carry = 0;
        String ans = "";
        for(;indexa>=0 && indexb>=0;indexa--,indexb--){
            int digit = carry + (a.charAt(indexa) - '0') + (b.charAt(indexb) - '0');
            carry = digit/2;
            ans = (digit%2) + ans;
        }
        for(;indexa>=0;indexa--){
            int digit = carry + (a.charAt(indexa) - '0');
            carry = digit/2;
            ans = (digit%2) + ans;
        }
        for(;indexb>=0;indexb--){
            int digit = carry + (b.charAt(indexb) - '0');
            carry = digit/2;
            ans = (digit%2) + ans;
        }
        if(carry == 1)
            ans = carry + ans;
        return ans;
    }
}
