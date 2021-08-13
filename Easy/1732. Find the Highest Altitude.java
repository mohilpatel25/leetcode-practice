/*
Problem Name: 1732. Find the Highest Altitude
Problem Link: https://leetcode.com/problems/find-the-highest-altitude/
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0, maxAlt = 0;
        for(int g: gain){
            altitude += g;
            maxAlt = Math.max(maxAlt, altitude);
        }
        return maxAlt;
    }
}
