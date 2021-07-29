/*
Problem Name: 419. Battleships in a Board
Problem Link: https://leetcode.com/problems/battleships-in-a-board/
*/
class Solution {
    public int countBattleships(char[][] board) {
        int rows = board.length, cols = board[0].length, count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j] == 'X'){
                    if(i>0 && board[i-1][j] == 'X')
                        continue;
                    if(j>0 && board[i][j-1] == 'X')
                        continue;
                    count++;
                }
            }
        }
        return count;
    }
}
