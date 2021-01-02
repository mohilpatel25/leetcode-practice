/*
Problem Name: 20. Valid Parentheses
Problem Link: https://leetcode.com/problems/valid-parentheses/
*/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(stck.isEmpty())
                stck.push(c);
            else if(c == '{' || c == '(' || c == '[')
                stck.push(c);
            else{
                if(c == '}' && stck.peek() == '{')
                    stck.pop();
                else if(c == ')' && stck.peek() == '(')
                    stck.pop();
                else if(c == ']' && stck.peek() == '[')
                    stck.pop();
                else
                    stck.push(c);
            }
        }
        return stck.isEmpty();
    }
}
