/*
Problem Name: 2. Add Two Numbers
Problem Link: https://leetcode.com/problems/add-two-numbers/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1), next = node, temp;
        int carry = 0;
        while((l1 != null) && (l2 != null)){
            temp = new ListNode((l1.val + l2.val + carry)%10);
            carry = (l1.val + l2.val + carry)/10;
            next.next = temp;
            next = temp;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            temp = new ListNode((l1.val + carry)%10);
            carry = (l1.val + carry)/10;
            next.next = temp;
            next = temp;
            l1 = l1.next;
        }
        while(l2 != null){
            temp = new ListNode((l2.val + carry)%10);
            carry = (l2.val + carry)/10;
            next.next = temp;
            next = temp;
            l2 = l2.next;
        }
        if(carry == 1){
            next.next = new ListNode(1);
        }
        return node.next;
    }
}
