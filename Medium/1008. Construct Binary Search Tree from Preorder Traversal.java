/*
Problem Name: 1008. Construct Binary Search Tree from Preorder Traversal
Problem Link: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length-1);
    }
    static TreeNode buildTree(int[] preorder, int l, int r){
        if(l > r)
            return null;
        TreeNode root = new TreeNode(preorder[l]);
        if(l == r)
            return root;
        int nextRoot;
        for(nextRoot=l;nextRoot<=r;nextRoot++){
            if(preorder[nextRoot] > root.val){
                break;
            }
        }
        root.left = buildTree(preorder, l+1, nextRoot-1);
        root.right = buildTree(preorder, nextRoot, r);
        return root;
    }
}
