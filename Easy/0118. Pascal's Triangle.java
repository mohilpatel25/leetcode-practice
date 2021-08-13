/*
Problem Name: 118. Pascal's Triangle
Problem Link: https://leetcode.com/problems/pascals-triangle/
Difficulty: Easy
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return triangle;
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevrow = triangle.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(prevrow.get(j-1) + prevrow.get(j));
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
