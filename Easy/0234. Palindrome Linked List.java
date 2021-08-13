/*
Problem Name: 234. Palindrome Linked List
Problem Link: https://leetcode.com/problems/palindrome-linked-list/
Difficulty: Easy
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null, next=null;
        while(slow != null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        fast = head;
        while(prev != null && head != null){
            if(prev.val != head.val)
                return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
