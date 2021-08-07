/*
Problem Name: 515. Find Largest Value in Each Tree Row
Problem Link: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
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
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return new ArrayList<Integer>();
        List<Integer> rowmax = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int curmax = root.val;
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();
            if(cur == null){
                rowmax.add(curmax);
                curmax = Integer.MIN_VALUE;
                if(queue.peek() == null)
                    break;
                queue.add(null);
            }
            else{
                curmax = Math.max(curmax, cur.val);
                if(cur.left != null)
                    queue.add(cur.left);
                if(cur.right != null)
                    queue.add(cur.right);
            }
        }
        return rowmax;
    }
}
