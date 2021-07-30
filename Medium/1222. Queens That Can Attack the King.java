/*
Problem Name: 1222. Queens That Can Attack the King
Problem Link: https://leetcode.com/problems/queens-that-can-attack-the-king/
*/
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int board[][] = new int[8][8], q = queens.length;
        for(int i=0;i<q;i++)
            board[queens[i][0]][queens[i][1]] = 1;
        int direction[][] = {{-1,0}, {-1,-1}, {0,-1}, {-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}};
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        for(int d=0;d<8;d++){
            for(int i=king[0],j=king[1];i>=0 && i<8 && j>=0 && j<8;i+=direction[d][0],j+=direction[d][1]){
                if(board[i][j] == 1){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    list.add(j);
                    answer.add(list);
                    break;
                }
            }
        }
        return answer;
    }
}
