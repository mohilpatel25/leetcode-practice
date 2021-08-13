/*
Problem Name: 69. Sqrt(x)
Problem Link: https://leetcode.com/problems/sqrtx/
Difficulty: Easy
*/
class Solution {
    public int mySqrt(int x) {
        if(x <= 1)
            return x;
        long l = 0, r = x/2, ans = x;
        for(;l<=r;){
            long mid = l + (r-l)/2;
            if(mid*mid == x)
                return (int)mid;
            if(mid*mid > x)
                r = mid - 1;
            else{
                ans = mid;
                l = mid + 1;
            }
        }
        return (int)ans;
    }
}
