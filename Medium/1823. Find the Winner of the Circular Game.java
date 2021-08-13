/*
Problem Name: 1823. Find the Winner of the Circular Game
Problem Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/
*/
class Solution {
    public int findTheWinner(int n, int k) {
        if(n == 1)
            return 1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            list.add(i);
        int cur = 0;
        while(list.size() > 1){
            cur = (cur + k - 1)%n;
            list.remove(cur);
            n = list.size();
        }
        return list.get(0);
    }
}
