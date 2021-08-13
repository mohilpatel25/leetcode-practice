/*
Problem Name: 1833. Maximum Ice Cream Bars
Problem Link: https://leetcode.com/problems/maximum-ice-cream-bars/
Difficulty: Medium
*/
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count[] = new int[100001];
        int bars = 0, n = costs.length;
        for(int i=0;i<n;i++)
            count[costs[i]]++;
        for(int i=1;i<=100000;i++){
            if(count[i] > 0){
                int quant = Math.min(coins/i, count[i]);
                coins -= quant*i;
                bars += quant;
            }
        }
        return bars;
    }
}
