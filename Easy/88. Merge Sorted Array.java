/*
Problem Name: 88. Merge Sorted Array
Problem Link: https://leetcode.com/problems/merge-sorted-array/
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m + n - 1, p2 = 0, cur = 0;
        for(int i=m-1;i>=0;i--,p1--){
            nums1[p1] = nums1[i];
        }
        p1++;
        for(;p1 < m+n && p2 < n;){
            if(nums1[p1] <= nums2[p2])
                nums1[cur++] = nums1[p1++];
            else
                nums1[cur++] = nums2[p2++];
        }
        for(;p2 < n;)
            nums1[cur++] = nums2[p2++];
    }
}
