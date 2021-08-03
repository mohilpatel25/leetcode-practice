/*
Problem Name: 1807. Evaluate the Bracket Pairs of a String
Problem Link: https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
*/
class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<String,String>();
        for(List<String> pair: knowledge)
            map.put(pair.get(0), pair.get(1));
        int n = s.length();
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                i++;
                StringBuilder key = new StringBuilder();
                while(s.charAt(i) != ')')
                    key.append(s.charAt(i++));
                if(map.containsKey(key.toString()))
                    answer.append(map.get(key.toString()));
                else
                    answer.append("?");
            }
            else{
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
