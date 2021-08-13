/*
Problem Name: 86. Partition List
Problem Link: https://leetcode.com/problems/partition-list/
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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(-1), bigger = new ListNode(-1);
        ListNode s_trav = smaller, b_trav=bigger;
        while(head != null){
            if(head.val < x){
                s_trav.next = head;
                s_trav = s_trav.next;
            }
            else{
                b_trav.next = head;
                b_trav = b_trav.next;
            }
            head = head.next;
        }
        b_trav.next = null;
        s_trav.next = bigger.next;
        return smaller.next;
    }
}
