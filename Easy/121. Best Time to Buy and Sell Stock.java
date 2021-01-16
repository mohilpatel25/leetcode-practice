/*
Problem Name: 121. Best Time to Buy and Sell Stock
Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, minPrice = prices[0], n = prices.length;
        for(int i=1;i<n;i++){
            max = Math.max(max, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return max;
    }
}
