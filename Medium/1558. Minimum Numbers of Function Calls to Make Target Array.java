/*
Problem Name: 1558. Minimum Numbers of Function Calls to Make Target Array
Problem Link: https://leetcode.com/problems/minimum-numbers-of-function-calls-to-make-target-array/
*/
class Solution {
    public int minOperations(int[] nums) {
        int op1 = 0, op2 = 0, n = nums.length;
        int[] opPerNum;
        for(int i=0;i<n;i++){
            opPerNum = calOp(nums[i]);
            op1 += opPerNum[0];
            op2 = Math.max(op2, opPerNum[1]);
        }
        return op1 + op2;
    }
    int[] calOp(int num){
        int op1 = 0, op2 = 0;
        while(num > 0){
            if(num%2 == 0){
                num /= 2;
                op2++;
            }
            else{
                num--;
                op1++;
            }
        }
        return new int[]{op1, op2};
    }
}
