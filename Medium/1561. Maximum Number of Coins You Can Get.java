/*
Problem Name: 1561. Maximum Number of Coins You Can Get
Problem Link: https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
Difficulty: Medium
*/
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length, coins = 0, first = 0, secondLast = n - 2;
        while(first < n/3){
            coins += piles[secondLast];
            secondLast -= 2;
            first++;
        }
        return coins;
    }
}
