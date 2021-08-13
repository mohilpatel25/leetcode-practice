/*
Problem Name: 66. Plus One
Problem Link: https://leetcode.com/problems/plus-one/
*/
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length, answer[] = new int[n+1], carry = 0;
        digits[n-1]++;
        carry = digits[n-1]/10;
        digits[n-1] = digits[n-1]%10;
        answer[n] = digits[n-1];
        for(int i=n-2;i>=0;i--){
            digits[i] = digits[i] + carry;
            carry = digits[i]/10;
            digits[i] %=10;
            answer[i+1] = digits[i];
        }
        if(carry == 1){
            answer[0] = 1;
            return answer;
        }
        return digits;
    }
}
