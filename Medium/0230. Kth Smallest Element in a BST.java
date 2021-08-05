/*
Problem Name: 230. Kth Smallest Element in a BST
Problem Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
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
    int kvalue, k;
    public int kthSmallest(TreeNode root, int k) {
        kvalue = 0;
        this.k = k;
        inorder(root);
        return kvalue;
    }
    void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        k--;
        if(k == 0)
            kvalue = root.val;
        inorder(root.right);
    }
}
