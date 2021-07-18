/*
Problem Name: 1005. Maximize Sum Of Array After K Negations
Problem Link: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
*/
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int ind = 0, n = nums.length;
        for(;ind<n && k>0;ind++, k--){
            if(nums[ind] < 0){
                nums[ind] = -1*nums[ind];
            }
            else
                break;
        }
        Arrays.sort(nums);
        int sum = 0;
        k %= 2;
        nums[0] = k > 0 ? -1*nums[0] : nums[0];
        for(int i=0;i<n;i++)
            sum += nums[i];
        return sum;
    }
}
