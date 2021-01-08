/*
Problem Name: 75. Sort Colors
Problem Link: https://leetcode.com/problems/sort-colors/
*/
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = nums.length - 1;
        for(;one<=two;){
            if(nums[one] == 0){
                int t = nums[zero];
                nums[zero] = nums[one];
                nums[one] = t;
                zero++;
                one++;
            }
            else if(nums[one] == 1)
                one++;
            else if(nums[one] == 2){
                int t = nums[two];
                nums[two] = nums[one];
                nums[one] = t;
                two--;
            }
        }
    }
}
