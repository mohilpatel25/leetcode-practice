/*
Problem Name: 94. Binary Tree Inorder Traversal
Problem Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorderTrav(root, inorder);
        return inorder;
    }
    void inorderTrav(TreeNode root, List<Integer> inorder){
        if(root == null)
            return;
        inorderTrav(root.left, inorder);
        inorder.add(root.val);
        inorderTrav(root.right, inorder);
    }
}
