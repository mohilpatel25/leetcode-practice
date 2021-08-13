/*
Problem Name: 36. Valid Sudoku
Problem Link: https://leetcode.com/problems/valid-sudoku/
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<9;i++){
            set.clear();
            for(int j=0;j<9;j++){
                if(board[i][j] != '.' && set.contains(board[i][j]))
                    return false;
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            set.clear();
            for(int j=0;j<9;j++){
                if(board[j][i] != '.' && set.contains(board[j][i]))
                    return false;
                set.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                set.clear();
                for(int ii=i;ii<i+3;ii++){
                    for(int jj=j;jj<j+3;jj++){
                        if(board[ii][jj] != '.' && set.contains(board[ii][jj]))
                            return false;
                        set.add(board[ii][jj]);
                    }
                }
            }
        }
        return true;
    }
}
