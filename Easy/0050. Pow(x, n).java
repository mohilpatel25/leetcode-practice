/*
Problem Name: 50. Pow(x, n)
Problem Link: https://leetcode.com/problems/powx-n/
*/
class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n == -1)
            return 1/x;
        double p = myPow(x,n/2);
        if(n%2 == 0)
            return p*p;
        if(n < 0)
            return p*p*(1/x);
        return p*p*x;
    }
}
