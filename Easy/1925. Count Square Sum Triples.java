/*
Problem Name: 1925. Count Square Sum Triples
Problem Link: https://leetcode.com/problems/count-square-sum-triples/
Difficulty: Easy
*/
class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                double c = Math.sqrt(a*a + b*b);
                if((c - (int)c) == 0)
                    if(c > 0 && c <= n)
                        count++;
            }
        }
        return count;
    }
}
