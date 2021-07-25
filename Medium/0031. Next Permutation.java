/*
Problem Name: 31. Next Permutation
Problem Link: https://leetcode.com/problems/next-permutation/
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, ind;
        for(ind=n-2;ind>=0;ind--){
            if(nums[ind] < nums[ind+1])
                break;
        }
        if(ind == -1){
            Arrays.sort(nums);
            return;
        }
        int ind2 = n-1;
        while(nums[ind2] <= nums[ind]) ind2--;
        int t = nums[ind2];
        nums[ind2] = nums[ind];
        nums[ind] = t;
        for(int i=ind+1,j=n-1;i<=j;i++,j--){
            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
