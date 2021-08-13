/*
Problem Name: 1663. Smallest String With A Given Numeric Value
Problem Link: https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
*/
class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<n;i++, k--)
            answer.append('a');
        
        for(int i=n-1;i>=0 && k>0;i--){
            int deduction = Math.min(k, 'z' - 'a');
            answer.setCharAt(i, (char)(deduction + 'a'));
            k -= deduction;
        }
        return answer.toString();
    }
}
