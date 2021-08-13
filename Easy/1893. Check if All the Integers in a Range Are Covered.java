/*
Problem Name: 1893. Check if All the Integers in a Range Are Covered
Problem Link: https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
Difficulty: Easy
*/
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        boolean ans = true;
        for(int i=left;i<=right;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(ranges[j][0] <= i && i <= ranges[j][1]){
                    found = true;
                    break;
                }
            }
            ans = ans & found;
            if(!ans)
                break;
        }
        return ans;
    }
}
