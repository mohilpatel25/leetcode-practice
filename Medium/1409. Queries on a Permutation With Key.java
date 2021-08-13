/*
Problem Name: 1409. Queries on a Permutation With Key
Problem Link: https://leetcode.com/problems/queries-on-a-permutation-with-key/
Difficulty: Medium
*/
class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> permutation = new ArrayList<Integer>();
        for(int i=1;i<=m;i++)
            permutation.add(i);
        int n = queries.length, answer[] = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = permutation.indexOf(queries[i]);
            permutation.remove(answer[i]);
            permutation.add(0, queries[i]);
        }
        return answer;
    }
}
