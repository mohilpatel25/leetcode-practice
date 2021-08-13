/*
Problem Name: 1448. Count Good Nodes in Binary Tree
Problem Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/
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
    public int goodNodes(TreeNode root) {
        return count(root, Integer.MIN_VALUE);
    }
    int count(TreeNode root, int max){
        if(root == null)
            return 0;
        int good = 0;
        if(root.val >= max)
            good = 1;
        max = Math.max(max, root.val);
        return good + count(root.left, max) + count(root.right, max);
    }
}
