/*
Problem Name: 1710. Maximum Units on a Truck
Problem Link: https://leetcode.com/problems/maximum-units-on-a-truck/
*/
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        int n = boxTypes.length, maxUnits = 0;
        for(int i=0;i<n && truckSize>0;i++){
            int units = Math.min(truckSize, boxTypes[i][0]);
            maxUnits += units*boxTypes[i][1];
            truckSize -= units;
        }
        return maxUnits;
    }
}
