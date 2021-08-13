/*
Problem Name: 169. Majority Element
Problem Link: https://leetcode.com/problems/majority-element/
*/
class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], cnt = 1, n = nums.length;
        for(int i=1;i<n;i++){
            if(majority == nums[i])
                cnt++;
            else{
                cnt--;
                if(cnt == 0){
                    cnt = 1;
                    majority = nums[i];
                }
            }
        }
        return majority;
    }
}
