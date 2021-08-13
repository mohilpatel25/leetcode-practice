/*
Problem Name: 1828. Queries on Number of Points Inside a Circle
Problem Link: https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
Difficulty: Medium
*/
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int countQueries = queries.length, countPoints = points.length, count = 0;
        int insidePoints[] = new int[countQueries];
        for(int i=0;i<countQueries;i++){
            count = 0;
            for(int j=0;j<countPoints;j++){
                int x1 = points[j][0], y1 = points[j][1], x2 = queries[i][0], y2 = queries[i][1], radius = queries[i][2];
                if((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) <= radius*radius)
                    count++;
            }
            insidePoints[i] = count;
        }
        return insidePoints;
    }
}
