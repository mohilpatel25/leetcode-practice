/*
Problem Name: 80. Remove Duplicates from Sorted Array II
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = 1, trav = 1, n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                if(trav == 1){
                    trav = 0;
                    nums[cur] = nums[i];
                    cur++;
                }
            }
            else{
                trav = 1;
                nums[cur] = nums[i];
                cur++;
            }
        }
        return cur;
    }
}
