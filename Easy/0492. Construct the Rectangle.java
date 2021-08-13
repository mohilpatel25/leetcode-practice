/*
Problem Name: 492. Construct the Rectangle
Problem Link: https://leetcode.com/problems/construct-the-rectangle/
*/
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        while(area%W != 0)
            W--;
        return new int[]{area/W,W};
    }
}
