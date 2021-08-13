/*
Problem Name: 79. Word Search
Problem Link: https://leetcode.com/problems/word-search/
*/
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board, i, j, visited, word))
                    return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, int r, int c, boolean[][] v, String word){
        if(word.length() == 0){
            return true;
        }
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length)
            return false;
        if(v[r][c])
            return false;
        if(board[r][c] != word.charAt(0))
            return false;
        v[r][c] = true;
        boolean found = dfs(board, r-1, c, v, word.substring(1)) || dfs(board, r+1, c, v, word.substring(1)) || dfs(board, r, c-1, v, word.substring(1)) || dfs(board, r, c+1, v, word.substring(1));
        v[r][c] = false;
        return found;
    }
}
