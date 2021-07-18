/*
Problem Name: 1437. Check If All 1's Are at Least Length K Places Away
Problem Link: https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
*/
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastOne = 0, n = nums.length;
        while(lastOne < n && nums[lastOne] != 1)
            lastOne++;
        for(int i=lastOne+1;i<n;i++){
            if(nums[i] == 1){
                if(i - lastOne - 1 < k)
                    return false;
                lastOne = i;
            }
        }
        return true;
    }
}
