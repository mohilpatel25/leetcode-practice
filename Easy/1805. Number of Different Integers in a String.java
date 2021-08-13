/*
Problem Name: 1805. Number of Different Integers in a String
Problem Link: https://leetcode.com/problems/number-of-different-integers-in-a-string/
*/
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<String>();
        word += "a";
        int start = 0, n = word.length();
        for(int i=0;i<n;i++){
            if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                start = i;
                while(i<n && Character.isDigit(word.charAt(i)))
                    i++;
                String substr = word.substring(start, i);
                if(substr.charAt(0) == '0'){
                    start = 0;
                    while(start < substr.length() && substr.charAt(start) == '0')
                        start++;
                    if(start == substr.length())
                        substr = "0";
                    else
                        substr = substr.substring(start);
                }
                set.add(substr);
            }
        }
        return set.size();
    }
}
