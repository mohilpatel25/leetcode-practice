/*
Problem Name: 1382. Balance a Binary Search Tree
Problem Link: https://leetcode.com/problems/balance-a-binary-search-tree/
Difficulty: Medium
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);
        return buildTree(nodes, 0, nodes.size()-1);
    }
    TreeNode buildTree(List<Integer> nodes, int l, int r){
        if(l > r)
            return null;
        if(l == r)
            return new TreeNode(nodes.get(l));
        int rootval = (l+r)/2;
        TreeNode root = new TreeNode(nodes.get(rootval));
        root.left = buildTree(nodes, l, rootval-1);
        root.right = buildTree(nodes, rootval+1, r);
        return root;
    }
    void inorder(TreeNode root, List<Integer> nodes){
        if(root == null)
            return;
        inorder(root.left, nodes);
        nodes.add(root.val);
        inorder(root.right, nodes);
    }
}
