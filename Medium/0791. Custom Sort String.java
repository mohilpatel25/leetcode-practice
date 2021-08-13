/*
Problem Name: 791. Custom Sort String
Problem Link: https://leetcode.com/problems/custom-sort-string/
*/
class Solution {
    int priority[];
    public String customSortString(String order, String s) {
        priority = new int[26];
        int len = order.length();
        for(int i=0;i<len;i++)
            priority[order.charAt(i) - 'a'] = i;
        List<Character> list = new ArrayList<Character>();
        for(char c: s.toCharArray())
            list.add(c);
        Collections.sort(list, new comp());
        StringBuilder answer = new StringBuilder();
        for(char c: list)
            answer.append(c);
        return answer.toString();
    }
    public class comp implements Comparator<Character> {
        public int compare(Character c1, Character c2) {
            return priority[c1-'a'] - priority[c2-'a'];
        }
    }
}
