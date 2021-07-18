/*
Problem Name: 203. Remove Linked List Elements
Problem Link: https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        if(head == null)
            return head;
        ListNode prev = head, next = head;
        while(next != null){
            if(next.val == val){
                next = next.next;
                prev.next = next;
            }
            else{
                prev = next;
                next = next.next;
            }
        }
        return head;
    }
}
