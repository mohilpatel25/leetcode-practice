/*
Problem Name: 1557. Minimum Number of Vertices to Reach All Nodes
Problem Link: https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
*/
class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean hasIncomingEdge[] = new boolean[n];
        int len = edges.size();
        for(int i=0;i<len;i++){
            hasIncomingEdge[edges.get(i).get(1)] = true;
        }
        List<Integer> vertices = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(!hasIncomingEdge[i])
                vertices.add(i);
        }
        return vertices;
    }
}
