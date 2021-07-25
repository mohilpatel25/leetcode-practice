/*
Problem Name: 1769. Minimum Number of Operations to Move All Balls to Each Box
Problem Link: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
*/
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length(), answer[] = new int[n];
        char box[] = boxes.toCharArray();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(box[j] == '1')
                    count += Math.abs(j - i);
            }
            answer[i] = count;
        }
        return answer;
    }
}
