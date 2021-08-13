/*
Problem Name: 1910. Remove All Occurrences of a Substring
Problem Link: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/
Difficulty: Medium
*/
class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stck = new Stack<Character>();
        int slen = s.length(), plen = part.length();
        if(slen < plen)
            return s;
        for(char c: s.toCharArray()){
            stck.push(c);
            if(c == part.charAt(plen - 1))
                remove(stck, part);
            if(!stck.isEmpty() && stck.peek() == part.charAt(plen - 1))
                remove(stck, part);
        }
        String answer = "";
        while(!stck.isEmpty())
            answer = stck.pop() + answer;
        return answer.toString();
    }
    void remove(Stack<Character> stck, String part){
        int len = part.length();
        Stack<Character> temp = new Stack<Character>();
        if(stck.size() < len)
            return;
        for(int i=len-1;i>=0;i--){
            if(stck.peek() != part.charAt(i)){
                while(!temp.isEmpty())
                    stck.push(temp.pop());
                return;
            }
            temp.push(stck.pop());
        }
    }
}
