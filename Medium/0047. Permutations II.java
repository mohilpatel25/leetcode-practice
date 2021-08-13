/*
Problem Name: 47. Permutations II
Problem Link: https://leetcode.com/problems/permutations-ii/
Difficulty: Medium
*/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        if(nums.length  == 0)
            return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        generate(nums, set, new ArrayList<Integer>(), new boolean[n]);
        return new ArrayList<List<Integer>>(set);
    }
    void generate(int[] nums, Set<List<Integer>> set,List<Integer> l, boolean[] visited){
        if(l.size() == nums.length){
            set.add(new ArrayList(l));
            return;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                l.add(nums[i]);
                generate(nums, set, l, visited);
                l.remove(l.size() - 1);
                visited[i] = false;
            }
        }
    }
}
