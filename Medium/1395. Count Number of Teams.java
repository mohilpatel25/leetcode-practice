/*
Problem Name: 1395. Count Number of Teams
Problem Link: https://leetcode.com/problems/count-number-of-teams/
Difficulty: Medium
*/
class Solution {
    public int numTeams(int[] rating) {
        int teams = 0, n = rating.length;
        int left[][] = new int[n][2], right[][] = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(rating[i] < rating[j])
                    left[i][0]++;
                else if(rating[i] > rating[j])
                    left[i][1]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(rating[i] < rating[j])
                    right[i][0]++;
                else if(rating[i] > rating[j])
                    right[i][1]++;
            }
        }
        for(int i=0;i<n;i++){
            teams += left[i][0]*right[i][1] + left[i][1]*right[i][0];
        }
        return teams;
    }
}
