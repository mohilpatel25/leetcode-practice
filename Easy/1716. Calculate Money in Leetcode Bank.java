/*
Problem Name: 1716. Calculate Money in Leetcode Bank
Problem Link: https://leetcode.com/problems/calculate-money-in-leetcode-bank/
Difficulty: Easy
*/
class Solution {
    public int totalMoney(int n) {
        int money = 0, week = 1;
        for(;week<=n/7;week++){
            money += 7*(2*week+6)/2;
        }
        n %= 7;
        money += n*(2*week+n-1)/2;
        return money;
    }
}
