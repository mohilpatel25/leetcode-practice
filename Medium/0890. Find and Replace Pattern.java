/*
Problem Name: 890. Find and Replace Pattern
Problem Link: https://leetcode.com/problems/find-and-replace-pattern/
*/
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = words.length;
        List<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++){
            if(checkPattern(words[i], pattern))
                list.add(words[i]);
        }
        return list;
    }
    static boolean checkPattern(String word, String pattern){
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();
        int n = word.length();
        for(int i=0;i<n;i++){
            char wchar = word.charAt(i), pchar = pattern.charAt(i);
            if(map.containsKey(wchar)){
                if(map.get(wchar) != pchar)
                    return false;
            }
            else if(map.values().contains(pchar))
                return false;
            map.put(wchar, pchar);
            set.add(pchar);
        }
        return true;
    }
}
