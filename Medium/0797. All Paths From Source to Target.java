/*
Problem Name: 797. All Paths From Source to Target
Problem Link: https://leetcode.com/problems/all-paths-from-source-to-target/
*/
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        List<Integer> curPath = new ArrayList<Integer>();
        curPath.add(0);
        traverse(graph, 0, curPath, paths);
        return paths;
    }
    void traverse(int g[][], int curNode, List<Integer> curPath, List<List<Integer>> allPaths){
        int n = g.length;
        if(curNode == n - 1){
            allPaths.add(new ArrayList<>(curPath));
            return;
        }
        for(int next: g[curNode]){
            curPath.add(next);
            traverse(g, next, curPath, allPaths);
            curPath.remove(curPath.size()-1);
        }
    }
}
