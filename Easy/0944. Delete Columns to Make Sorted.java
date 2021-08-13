/*
Problem Name: 944. Delete Columns to Make Sorted
Problem Link: https://leetcode.com/problems/delete-columns-to-make-sorted/
Difficulty: Easy
*/
class Solution {
    public int minDeletionSize(String[] strs) {
        int cols = strs[0].length(), rows = strs.length;
        int delete = 0;
        for(int i=0;i<cols;i++){
            for(int j=1;j<rows;j++){
                if(strs[j].charAt(i) < strs[j-1].charAt(i)){
                    delete++;
                    break;
                }
            }
        }
        return delete;
    }
}
