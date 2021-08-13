/*
Problem Name: 415. Add Strings
Problem Link: https://leetcode.com/problems/add-strings/
*/
class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();
        int max = Math.max(l1, l2), carry = 0;
        String ans = "";
        l1--;
        l2--;
        for(int i=0;i<max;i++){
            int sum = 0;
            if(l1 >= 0){
                sum += (num1.charAt(l1) - '0');
                l1--;
            }
            if(l2 >= 0){
                sum += (num2.charAt(l2) - '0');
                l2--;
            }
            sum += carry;
            ans = sum%10 + ans;
            carry = sum/10;
        }
        if(carry > 0)
            ans = carry + ans;
        return ans;
    }
}
