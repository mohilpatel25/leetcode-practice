/*
Problem Name: 119. Pascal's Triangle II
Problem Link: https://leetcode.com/problems/pascals-triangle-ii/
*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> prevrow = new ArrayList<Integer>();
        row.add(1);
        if(rowIndex == 0)
            return row;
        prevrow.addAll(row);
        for(int i=1;i<=rowIndex;i++){
            row.clear();
            row.add(1);
            for(int j=1;j<i;j++)
                row.add(prevrow.get(j-1) + prevrow.get(j));
            row.add(1);
            prevrow.clear();
            prevrow.addAll(row);
        }
        return prevrow;
    }
}
