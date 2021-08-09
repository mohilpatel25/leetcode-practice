/*
Problem Name: 547. Number of Provinces
Problem Link: https://leetcode.com/problems/number-of-provinces/
*/
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0, n = isConnected.length;
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                visit(isConnected, visited, i);
                provinces++;
            }
        }
        return provinces;
    }
    void visit(int graph[][], boolean[] visited, int cur){
        visited[cur] = true;
        int n = graph.length;
        for(int i=0;i<n;i++){
            if(graph[cur][i] == 1 && !visited[i])
                visit(graph, visited, i);
        }
    }
}
