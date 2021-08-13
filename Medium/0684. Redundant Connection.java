/*
Problem Name: 684. Redundant Connection
Problem Link: https://leetcode.com/problems/redundant-connection/
Difficulty: Medium
*/
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        Set<Integer> visible = new HashSet<Integer>();
        for(int i=1;i<=n;i++)
            graph[i] = new ArrayList<Integer>();
        for(int[] edge: edges){
            visible.clear();
            if(dfs(graph, visible, edge[0], edge[1])){
                return edge;
            }
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        return null;
    }
    boolean dfs(ArrayList<Integer>[] graph, Set<Integer> visited, int source, int destination){
        if(!visited.contains(source)){
            if(source == destination)
                return true;
            visited.add(source);
            for(int v: graph[source]){
                if(dfs(graph, visited, v, destination))
                    return true;
            }
        }
        return false;
    }
}
