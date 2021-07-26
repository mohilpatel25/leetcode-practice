/*
Problem Name: 654. Maximum Binary Tree
Problem Link: https://leetcode.com/problems/maximum-binary-tree/
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length-1);
    }
    static TreeNode build(int nums[], int l, int r){
        if(l > r)
            return null;
        if(l == r)
            return new TreeNode(nums[l]);
        int index = maxIndex(nums, l, r);
        TreeNode root = new TreeNode(nums[index]);
        root.left = build(nums, l, index - 1);
        root.right = build(nums, index + 1, r);
        return root;
    }
    static int maxIndex(int nums[], int l, int r){
        int index = l;
        for(int i=l;i<=r;i++){
            if(nums[i] > nums[index])
                index = i;
        }
        return index;
    }
}
