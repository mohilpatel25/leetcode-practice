/*
Problem Name: 8. String to Integer (atoi)
Problem Link: https://leetcode.com/problems/string-to-integer-atoi/
*/
class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0)
            return 0;
        long num = 0;
        int ind = 0, n = s.length(), sign = 1;
        while((ind < n) && (s.charAt(ind) == ' '))
            ind++;
        if(ind >= n)
            return 0;
        if(s.charAt(ind) == '-'){
            sign = -1;
            ind++;
        }
        else if(s.charAt(ind) == '+'){
            sign = 1;
            ind++;
        }
        if(ind >= n)
            return 0;
        if(s.charAt(ind) < '0' || s.charAt(ind) > '9')
            return 0;
        while((ind < n) && (s.charAt(ind) >= '0') && (s.charAt(ind) <= '9')){
            num = num*10 + (s.charAt(ind) - '0');
            if(num > Integer.MAX_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ind++;
        }
        if(num > Integer.MAX_VALUE){
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign*(int)num;
    }
}
