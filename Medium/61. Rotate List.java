/*
Problem Name: 61. Rotate List
Problem Link: https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        int n = 0;
        ListNode temp = head, last = head;
        while(temp != null){
            n++;
            last = temp;
            temp = temp.next;
        }
        k %= n;
        if(k == 0)
            return head;

        k  = n - k;
        ListNode prev = head;
        temp = head;
        while(k > 0){
            k--;
            prev = temp;
            temp = temp.next;
        }
        last.next = head;
        prev.next = null;
        return temp;
    }
}
