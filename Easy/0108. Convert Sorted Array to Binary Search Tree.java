/*
Problem Name: 108. Convert Sorted Array to Binary Search Tree
Problem Link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
    TreeNode buildTree(int nums[], int l, int r){
        if(l > r)
            return null;
        int mid = (r + l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, l, mid-1);
        root.right = buildTree(nums, mid+1, r);
        return root;
    }
}
