/*
Problem Name: 52. N-Queens II
Problem Link: https://leetcode.com/problems/n-queens-ii/
Difficulty: Hard
*/
class Solution {
    int cnt = 0;
    public int totalNQueens(int n) {
        if(n == 1)
            return 1;
        else if(n >= 4){
            char board[][] = new char[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    board[i][j] = '.';
            generate(board, 0);
        }
        return cnt;
    }
    void generate(char board[][], int col){
        int n=board.length;
        if(col >= board.length){
            cnt++;
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isValid(board,i,col)){
                board[i][col] = 'Q';
                generate(board, col + 1);
                board[i][col] = '.';
            }
        }
    }
    boolean isValid(char board[][], int r, int c){
        for(int i=r;i>=0;i--){
            if(board[i][c] == 'Q')
                return false;
        }
        for(int i=c;i>=0;i--){
            if(board[r][i] == 'Q')
                return false;
        }
        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i=r,j=c;i<board.length && j>=0;i++,j--){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
