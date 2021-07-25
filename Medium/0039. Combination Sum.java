/*
Problem Name: 39. Combination Sum
Problem Link: https://leetcode.com/problems/combination-sum/
*/
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        create(candidates, target, 0, new ArrayList<Integer>(), ans);
        return new ArrayList<List<Integer>>(ans);
    }
    void create(int[] candidates, int target, int index, List<Integer> l, Set<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList(l));
            return;
        }
        int n = candidates.length;
        for(int i=index;i<n;i++){
            if(target - candidates[i] >= 0){
                l.add(candidates[i]);
                create(candidates, target - candidates[i], i, l, ans);
                l.remove(l.size() - 1);
            }
        }
    }
}
