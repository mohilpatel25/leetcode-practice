/*
Problem Name: 18. 4Sum
Problem Link: https://leetcode.com/problems/4sum/
Difficulty: Medium
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length < 4)
            return new ArrayList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        int n = nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            List<Integer> temp = new ArrayList<Integer>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> list  = new ArrayList<List<Integer>>(set);
        return list;
    }
}
