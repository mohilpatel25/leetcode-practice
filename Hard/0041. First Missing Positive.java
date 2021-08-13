/*
Problem Name: 41. First Missing Positive
Problem Link: https://leetcode.com/problems/first-missing-positive/
Difficulty: Hard
*/
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 1;
        for(int i=0;i<n;i++){
            if(nums[i] < 0 || nums[i] > nums.length)
                nums[i] = 0;
        }
        for(int i=0;i<n;i++){
            if(nums[i] != 0 && nums[i] != -1000){
                if(nums[Math.abs(nums[i]) - 1] == 0)
                    nums[Math.abs(nums[i]) - 1] = -1000;
                else
                    nums[Math.abs(nums[i]) - 1] = -1*Math.abs(nums[Math.abs(nums[i]) - 1]);
            }
        }
        for(int i=0;i<n;i++)
            System.out.print(nums[i]+" ");
        int min = n;
        for(int i=0;i<n;i++){
            if(nums[i] >= 0)
                return i + 1;
            min = Math.min(min, nums[i]);
        }
        
        return n + 1;
    }
}
