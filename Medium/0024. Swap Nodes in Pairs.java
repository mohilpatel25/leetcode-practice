/*
Problem Name: 24. Swap Nodes in Pairs
Problem Link: https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        head = head.next;
        temp.next = head.next;
        head.next = temp;
        temp.next = swapPairs(temp.next);
        return head;
    }
}
