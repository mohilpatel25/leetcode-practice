/*
Problem Name: 859. Buddy Strings
Problem Link: https://leetcode.com/problems/buddy-strings/
*/
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        int count[] = new int[26], n = s.length();
        List<Integer> mismatch = new ArrayList<Integer>();
        boolean swap = false;
        for(int i=0;i<n;i++){
            count[s.charAt(i) - 'a']++;
            if(count[s.charAt(i) - 'a'] >= 2)
                swap = true;
            if(s.charAt(i) != goal.charAt(i))
                mismatch.add(i);
        }
        if(s.equals(goal))
            return swap;
        if(mismatch.size() != 2)
            return false;
        return (s.charAt(mismatch.get(0)) == goal.charAt(mismatch.get(1))) && (s.charAt(mismatch.get(1)) == goal.charAt(mismatch.get(0)));
    }
}
