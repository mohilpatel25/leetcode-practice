/*
Problem Name: 110. Balanced Binary Tree
Problem Link: https://leetcode.com/problems/balanced-binary-tree/
Difficulty: Easy
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
    boolean balanced;
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        System.out.println(check(root));
        return balanced;
    }
    int check(TreeNode root){
        if(root == null)
            return 0;
        int l = check(root.left), r = check(root.right);
        if(Math.abs(l - r) >= 2)
            balanced = false;
        return 1 + Math.max(l,r);
    }
}
