/*
Problem Name: 1779. Find Nearest Point That Has the Same X or Y Coordinate
Problem Link: https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
Difficulty: Easy
*/
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int valid = -1, n = points.length, minDist = 100000;
        for(int i=0;i<n;i++){
            if((points[i][0] == x) || (points[i][1] == y)){
                int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(dist < minDist){
                    minDist = dist;
                    valid = i;
                }
            }
        }
        return valid;
    }
}
