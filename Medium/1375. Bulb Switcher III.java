/*
Problem Name: 1375. Bulb Switcher III
Problem Link: https://leetcode.com/problems/bulb-switcher-iii/
*/
class Solution {
    public int numTimesAllBlue(int[] light) {
        int moment = 0, maxBulb = 0, n = light.length;
        for(int i=0;i<n;i++){
            maxBulb = Math.max(maxBulb, light[i]);
            if((i+1) == maxBulb)
                moment++;
        }
        return moment;
    }
}
