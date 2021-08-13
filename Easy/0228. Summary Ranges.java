/*
Problem Name: 228. Summary Ranges
Problem Link: https://leetcode.com/problems/summary-ranges/
Difficulty: Easy
*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if(nums.length == 0)
            return ans;
        int prev = nums[0], n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1] + 1){
                if(nums[i-1] == prev)
                    ans.add(prev+"");
                else
                    ans.add(prev+"->"+nums[i-1]);
                prev = nums[i];
            }
        }
        if(nums[n-1] == prev)
            ans.add(prev+"");
        else
            ans.add(prev+"->"+nums[n-1]);
        return ans;
    }
}
