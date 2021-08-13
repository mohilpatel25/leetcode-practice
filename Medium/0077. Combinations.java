/*
Problem Name: 77. Combinations
Problem Link: https://leetcode.com/problems/combinations/
*/
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        Set<List<Integer>> ans = new HashSet<List<Integer>>();
        generate(ans, new ArrayList<Integer>(), 0, n, k, new boolean[n]);
        return new ArrayList<List<Integer>>(ans);
    }
    void generate(Set<List<Integer>> ans, List<Integer> l, int cur, int n, int k, boolean[] v){
        if(l.size() == k){
            ans.add(new ArrayList(l));
            return;
        }
        for(int i=cur;i<n;i++){
            if(!v[i]){
                l.add(i+1);
                v[i] = true;
                generate(ans, l, i, n, k, v);
                v[i] = false;
                l.remove(l.size() - 1);
            }
        }
    }
}
