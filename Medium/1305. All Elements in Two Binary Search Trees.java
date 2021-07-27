/*
Problem Name: 1305. All Elements in Two Binary Search Trees
Problem Link: https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root1, list);
        inorder(root2, list);
        Collections.sort(list);
        return list;
    }
    static void inorder(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
