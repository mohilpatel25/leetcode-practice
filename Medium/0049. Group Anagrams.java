/*
Problem Name: 49. Group Anagrams
Problem Link: https://leetcode.com/problems/group-anagrams/
Difficulty: Medium
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<List<Integer>, List<String>>();
        for(String s: strs){
            List<Integer> l = new ArrayList<Integer>();
            for(int i=0;i<26;i++)
                l.add(0);
            for(char c:s.toCharArray())
                l.set(c - 'a', l.get(c - 'a') + 1);
            if(map.containsKey(l))
                map.get(l).add(s);
            else{
                map.put(l, new ArrayList<String>());
                map.get(l).add(s);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
