/*
Problem Name: 1161. Maximum Level Sum of a Binary Tree
Problem Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int maxSum = Integer.MIN_VALUE, maxLevel = -1, curLevel = 1, sum = 0;
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();
            if(cur == null){
                if(maxSum < sum){
                    maxSum = sum;
                    maxLevel = curLevel;
                }
                sum = 0;
                curLevel++;
                queue.add(null);
                if(queue.peek() == null)
                    break;
            }
            else{
                sum += cur.val;
                if(cur.left != null)
                    queue.add(cur.left);
                if(cur.right != null)
                    queue.add(cur.right);
            }
        }
        return maxLevel;
    }
}
