/*
Problem Name: 1637. Widest Vertical Area Between Two Points Containing No Points
Problem Link: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
Difficulty: Medium
*/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        int max = 0, n = points.length;
        for(int i=1;i<n;i++){
            max = Math.max(max, points[i][0] - points[i-1][0]);
        }
        return max;
    }
}
