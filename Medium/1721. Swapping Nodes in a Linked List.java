/*
Problem Name: 1721. Swapping Nodes in a Linked List
Problem Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
Difficulty: Medium
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1 = head, node2 = head;
        int n = k - 1;
        while(n > 0){
            n--;
            node1 = node1.next;
        }
        while(node2 != null){
            n++;
            node2 = node2.next;
        }
        n = n - k;
        node2 = head;
        while(n > 0){
            n--;
            node2 = node2.next;
        }
        n = node1.val;
        node1.val = node2.val;
        node2.val = n;
        return head;
    }
}
