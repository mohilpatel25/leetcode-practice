/*
Problem Name: 1854. Maximum Population Year
Problem Link: https://leetcode.com/problems/maximum-population-year/
Difficulty: Easy
*/
class Solution {
    public int maximumPopulation(int[][] logs) {
        int years[] = new int[101], n = logs.length;
        for(int i=0;i<n;i++){
            years[logs[i][0] - 1950]++;
            years[logs[i][1] - 1950]--;
        }
        int max = 0, year = 0, sum = 0;
        for(int i=0;i<=100;i++){
            sum += years[i];
            if(sum > max){
                max = sum;
                year = i + 1950;
            }
        }
        return year;
    }
}
