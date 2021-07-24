/*
Problem Name: 1822. Sign of the Product of an Array
Problem Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
*/
class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int n: nums){
            product *= signFunc(n);
        }
        return signFunc(product);
    }
    static int signFunc(int n){
        if(n > 0)
            return 1;
        if(n < 0)
            return -1;
        return 0;
    }
}
