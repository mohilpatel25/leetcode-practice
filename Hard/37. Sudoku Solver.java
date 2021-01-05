/*
Problem Name: 37. Sudoku Solver
Problem Link: https://leetcode.com/problems/sudoku-solver/
*/
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    static boolean solve(char[][] board){
        int empty_cell[] = empty(board);
        if(empty_cell[0] == -1)
            return true;
        for(int i=1;i<=9;i++){
            if(isValid(board, empty_cell[0], empty_cell[1], (char)('0'+i))){
                board[empty_cell[0]][empty_cell[1]] = (char)('0'+i);
                if(solve(board))
                    return true;
                else
                    board[empty_cell[0]][empty_cell[1]] = '.';
            }
        }
        return false;
    }
    static int[] empty(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                if(board[i][j] == '.')
                    return new int[]{i,j};
        }
        return new int[]{-1,-1};
    }
    static boolean isValid(char board[][], int r, int c, char num){
        for(int i=0;i<9;i++){
            if(board[r][i] == num)
                return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][c] == num)
                return false;
        }
        r = (r/3)*3;
        c = (c/3)*3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j] == num)
                    return false;
            }
        }
        return true;
    }
}
