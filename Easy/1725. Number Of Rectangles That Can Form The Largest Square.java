/*
Problem Name: 1725. Number Of Rectangles That Can Form The Largest Square
Problem Link: https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
*/
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        int n = rectangles.length;
        double side = 0;
        for(int i=0;i<n;i++){
            side = Math.min(rectangles[i][0], rectangles[i][1]);
            map.put(side, map.getOrDefault(side, 0) + 1);
        }
        return map.get(Collections.max(map.keySet()));
    }
}
