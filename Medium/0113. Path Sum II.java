/*
Problem Name: 113. Path Sum II
Problem Link: https://leetcode.com/problems/path-sum-ii/
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        traverse(root, targetSum, paths, new ArrayList<Integer>());
        return paths;
    }
    void traverse(TreeNode root, int target, List<List<Integer>> paths, List<Integer> curPath){
        if(root == null)
            return;
        else if(root.left == null && root.right == null){
            target -= root.val;
            if(target == 0){
                curPath.add(root.val);
                paths.add(new ArrayList<Integer>(curPath));
                curPath.remove(curPath.size() - 1);
            }
        }
        else{
            curPath.add(root.val);
            traverse(root.left, target-root.val, paths, curPath);
            traverse(root.right, target-root.val, paths, curPath);
            curPath.remove(curPath.size() - 1);
        }
    }
}
