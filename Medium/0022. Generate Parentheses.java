/*
Problem Name: 22. Generate Parentheses
Problem Link: https://leetcode.com/problems/generate-parentheses/
*/
class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<String>();
        generate(set, n, "", 0, 0);
        return new ArrayList<String>(set);
    }
    void generate(Set<String> l, int n, String par, int open, int close){
        if(par.length() == 2*n){
            l.add(par);
            return;
        }
        if(open < n)
            generate(l, n, par+"(", open+1, close);
        if(close < open)
            generate(l, n, par+")", open, close+1);
    }
}
