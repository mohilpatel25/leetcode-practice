/*
Problem Name: 1669. Merge In Between Linked Lists
Problem Link: https://leetcode.com/problems/merge-in-between-linked-lists/
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1, end = list1;
        while(b >= 0){
            if(a > 1){
                start = start.next;
                a--;
            }
            end = end.next;
            b--;
        }
        start.next = list2;
        while(start.next != null)
            start = start.next;
        start.next = end;
        return list1;
    }
}
