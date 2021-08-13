/*
Problem Name: 9. Palindrome Number
Problem Link: https://leetcode.com/problems/palindrome-number/
*/
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, temp = x;
        while(temp > 0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        return rev == x;
    }
}
