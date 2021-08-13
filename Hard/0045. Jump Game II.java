/*
Problem Name: 45. Jump Game II
Problem Link: https://leetcode.com/problems/jump-game-ii/
*/
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int n = nums.length, dp[] = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1,c=0;j<n && c<nums[i];j++,c++)
                dp[j] = Math.min(dp[j], dp[i] + 1);
        }
        for(int i=0;i<n;i++)
            System.out.print(dp[i]+" ");
        return dp[n-1];
    }
}
