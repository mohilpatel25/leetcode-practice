/*
Problem Name: 46. Permutations
Problem Link: https://leetcode.com/problems/permutations/
*/
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return ans;
        int n = nums.length;
        generate(nums, ans, new ArrayList<Integer>(), new boolean[n]);
        return ans;
    }
    void generate(int[] nums, List<List<Integer>> ans,List<Integer> l, boolean[] visited){
        if(l.size() == nums.length){
            ans.add(new ArrayList(l));
            return;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                l.add(nums[i]);
                generate(nums, ans, l, visited);
                l.remove(l.size() - 1);
                visited[i] = false;
            }
        }
    }
}
