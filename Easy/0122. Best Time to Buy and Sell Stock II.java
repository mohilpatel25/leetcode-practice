/*
Problem Name: 122. Best Time to Buy and Sell Stock II
Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
Difficulty: Easy
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, n = prices.length;
        for(int i=1;i<n;i++)
            if(prices[i] > prices[i-1])
                max += prices[i] - prices[i-1];
        return max;
    }
}
