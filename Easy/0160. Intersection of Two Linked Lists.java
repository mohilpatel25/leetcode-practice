/*
Problem Name: 160. Intersection of Two Linked Lists
Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
Difficulty: Easy
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while(A != B){
            if(A == null)
                A = headB;
            else
                A = A.next;
            if(B == null)
                B = headA;
            else
                B = B.next;
        }
        return A;
    }
}
