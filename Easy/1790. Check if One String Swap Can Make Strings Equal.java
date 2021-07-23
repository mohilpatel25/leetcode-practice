/*
Problem Name: 1790. Check if One String Swap Can Make Strings Equal
Problem Link: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
*/
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        int n = s1.length();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i))
                list.add(i);
        }
        if(list.size() != 2)
            return false;
        return (s1.charAt(list.get(0)) == s2.charAt(list.get(1))) && (s1.charAt(list.get(1)) == s2.charAt(list.get(0)));
    }
}
