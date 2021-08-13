/*
Problem Name: 205. Isomorphic Strings
Problem Link: https://leetcode.com/problems/isomorphic-strings/
Difficulty: Easy
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char sch = s.charAt(i), tch = t.charAt(i);
            if(map.containsKey(sch)){
                if(map.get(sch) != tch)
                    return false;
            }
            else if(map.values().contains(tch))
                return false;
            else{
                map.put(sch, tch);
            }
        }
        return true;
    }
}
