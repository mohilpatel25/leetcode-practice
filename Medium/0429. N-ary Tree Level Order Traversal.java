/*
Problem Name: 429. N-ary Tree Level Order Traversal
Problem Link: https://leetcode.com/problems/n-ary-tree-level-order-traversal/
Difficulty: Medium
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        traverse(root, levels);
        return levels;
    }
    void traverse(Node root, List<List<Integer>> levels){
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        List<Integer> list = new ArrayList<Integer>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            Node curNode = queue.remove();
            if(curNode != null){
                list.add(curNode.val);
                List<Node> children = curNode.children;
                for(Node node: children)
                    queue.add(node);
            }
            else{
                levels.add(new ArrayList(list));
                if(queue.peek() == null)
                    return;
                list.clear();
                queue.add(null);
            }
        }
    }
}
