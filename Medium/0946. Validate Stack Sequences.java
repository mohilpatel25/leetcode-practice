/*
Problem Name: 946. Validate Stack Sequences
Problem Link: https://leetcode.com/problems/validate-stack-sequences/
*/
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length, cur = 0;
        Stack<Integer> stck = new Stack<Integer>();
        for(int i=0;i<n;i++){
            stck.push(pushed[i]);
            while(!stck.isEmpty() && stck.peek()==popped[cur]){
                stck.pop();
                cur++;
            }
        }
        if(cur == n)
            return true;
        return false;
    }
}
