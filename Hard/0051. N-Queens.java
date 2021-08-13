/*
Problem Name: 51. N-Queens
Problem Link: https://leetcode.com/problems/n-queens/
Difficulty: Hard
*/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> configurations = new ArrayList<List<String>>();
        if(n == 1){
            List<String> l = new ArrayList<String>();
            l.add("Q");
            configurations.add(l);
        }
        else if(n >= 4){
            char board[][] = new char[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    board[i][j] = '.';
            generate(configurations, board, 0);
        }
        return configurations;
    }
    void generate(List<List<String>> config, char board[][], int col){
        int n=board.length;
        if(col >= board.length){
            List<String> l = new ArrayList<String>();
            for(int i=0;i<n;i++){
                String row = "";
                for(int j=0;j<n;j++)
                    row += board[i][j];
                l.add(row);
            }
            config.add(new ArrayList(l));
            return;
        }
        
        for(int i=0;i<n;i++){
            if(isValid(board,i,col)){
                board[i][col] = 'Q';
                generate(config, board, col + 1);
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
