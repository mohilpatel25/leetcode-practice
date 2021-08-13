/*
Problem Name: 1315. Sum of Nodes with Even-Valued Grandparent
Problem Link: https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
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
    public int sumEvenGrandparent(TreeNode root) {
        return sumGP(root, new TreeNode(1), new TreeNode(1));
    }
    int sumGP(TreeNode root, TreeNode gp, TreeNode p){
        if(root == null)
            return 0;
        int sum = 0;
        if(gp.val%2 == 0)
            sum += root.val;
        sum += sumGP(root.left, p, root);
        sum += sumGP(root.right, p, root);
        return sum;
    }
}
