/*
Problem Name: 7. Reverse Integer
Problem Link: https://leetcode.com/problems/reverse-integer/
Difficulty: Easy
*/
class Solution {
    public int reverse(int x) {
        long rev = 0;
        int sign = 1;
        if(x < 0){
            sign = -1;
            x *= -1;
        }
        while(x>0){
            rev = rev*10 + x%10;
            x /= 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        return (int)rev*sign;
    }
}
