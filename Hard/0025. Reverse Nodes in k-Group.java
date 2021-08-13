/*
Problem Name: 25. Reverse Nodes in k-Group
Problem Link: https://leetcode.com/problems/reverse-nodes-in-k-group/
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1)
            return head;
        return swap(head, k);
    }
    ListNode swap(ListNode head, int k){
        ListNode last = head, nextlast = null;
        int cnt = 0;
        while(cnt < k-1 && last != null){
            cnt++;
            last = last.next;
        }
        if(last == null)
            return head;
        nextlast = last.next;
        last.next = null;
        head = reverse(head);
        last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = swap(nextlast, k);
        return head;
    }
    ListNode reverse(ListNode head){
        ListNode cur = head, next = head, prev = null;
        while(next != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
