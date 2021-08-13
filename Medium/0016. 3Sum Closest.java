/*
Problem Name: 16. 3Sum Closest
Problem Link: https://leetcode.com/problems/3sum-closest/
Difficulty: Medium
*/
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, sum = 1000000;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j = i+1, k = n-1;
            for(;j<k;){
                int temp = nums[i] + nums[j] + nums[k];
                if(Math.abs(temp - target) < Math.abs(sum - target))
                    sum = temp;
                if(temp > target)
                    k--;
                else
                    j++;
            }
        }
        return sum;
    }
}
