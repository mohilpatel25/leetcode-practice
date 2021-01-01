/*
Problem Name: 4. Median of Two Sorted Arrays
Problem List: https://leetcode.com/problems/median-of-two-sorted-arrays/
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int m = nums1.length, n = nums2.length, i , j;
        for(i=0,j=0;i<m && j<n;){
            if(nums1[i] <= nums2[j])
                list.add(nums1[i++]);
            else
                list.add(nums2[j++]);
        }
        for(;i<m;i++)
            list.add(nums1[i]);
        for(;j<n;j++)
            list.add(nums2[j]);
        if((m+n)%2 == 0)
            return (float)(list.get((m+n)/2) + list.get((m+n)/2 - 1))/2;
        return list.get((m+n)/2);
    }
}
//The solution is not O(log(m+n)) as follow-up in question, but O(m+n).
