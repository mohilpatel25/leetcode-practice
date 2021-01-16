/*
Problem Name: 83. Remove Duplicates from Sorted List
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        if(head.next == null)
            return head;
        ListNode prev = head, temp = head.next;
        while(temp != null){
            while(temp != null && temp.val == prev.val)
                temp = temp.next;
            prev.next = temp;
            prev = temp;
            if(temp != null)
                temp = temp.next;
        }
        return head;
    }
}
