/*
Problem Name: 1110. Delete Nodes And Return Forest
Problem Link: https://leetcode.com/problems/delete-nodes-and-return-forest/
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<TreeNode>();
        Set<Integer> deleteValues = new HashSet<Integer>();
        for(int node: to_delete){
            deleteValues.add(node);
        }
        delete(root, deleteValues, forest);
        if(!deleteValues.contains(root.val))
            forest.add(root);
        return forest;
    }
    void delete(TreeNode root, Set<Integer> deleteValues, List<TreeNode> forest){
        if(root == null)
            return;
        delete(root.left, deleteValues, forest);
        delete(root.right, deleteValues, forest);
        if(root.left != null && deleteValues.contains(root.left.val))
            root.left = null;
        if(root.right != null && deleteValues.contains(root.right.val))
            root.right = null;
        if(deleteValues.contains(root.val)){
            if(root.left != null)
                forest.add(root.left);
            if(root.right != null)
                forest.add(root.right);
        }
    }
}
