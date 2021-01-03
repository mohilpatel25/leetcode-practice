/*
Problem Name: 21. Merge Two Sorted Lists
Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode(-1), temp = merged;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = temp.next;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            temp.next = l1;
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            temp.next = l2;
            temp = temp.next;
            l2 = l2.next;
        }
        temp.next = null;
        return merged.next;
    }
}
