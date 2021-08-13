/*
Problem Name: 99. Recover Binary Search Tree
Problem Link: https://leetcode.com/problems/recover-binary-search-tree/
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
    TreeNode previous = new TreeNode(Integer.MIN_VALUE), first = null, second = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int t = first.val;
        first.val = second.val;
        second.val = t;
    }
    void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        if((first == null) && (previous.val > root.val))
            first = previous;
        if((first != null) && (previous.val > root.val))
            second = root;
        previous = root;
        inorder(root.right);
    }
}
