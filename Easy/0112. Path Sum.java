/*
Problem Name: 112. Path Sum
Problem Link: https://leetcode.com/problems/path-sum/
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        return check(root, sum);
    }
    boolean check(TreeNode root, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null && (sum - root.val) == 0)
            return true;
        return check(root.left, sum - root.val) || check(root.right, sum - root.val);
    }
}
