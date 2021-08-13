/*
Problem Name: 495. Teemo Attacking
Problem Link: https://leetcode.com/problems/teemo-attacking/
Difficulty: Easy
*/
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int seconds = 0, n = timeSeries.length;
        for(int i=1;i<n;i++){
            if(timeSeries[i] - timeSeries[i-1] > duration - 1)
                seconds += duration;
            else
                seconds += timeSeries[i] - timeSeries[i-1];
        }
        seconds += duration;
        return seconds;
    }
}
