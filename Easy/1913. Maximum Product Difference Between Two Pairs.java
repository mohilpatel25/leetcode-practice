/*
Problem Name: 1913. Maximum Product Difference Between Two Pairs
Problem Link: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
*/
class Solution {
    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int n: nums){
            if(n > max1){
                max2 = max1;
                max1 = n;
            }
            else if(n > max2)
                max2 = n;
            
            if(n < min1){
                min2 = min1;
                min1 = n;
            }
            else if(n < min2)
                min2 = n;
        }
        return max1*max2 - min1*min2;
    }
}
