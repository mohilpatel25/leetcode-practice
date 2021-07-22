/*
Problem Name: 1704. Determine if String Halves Are Alike
Problem Link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
*/
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length(), count = 0;
        for(int i=0;i<n/2;i++){
            if(isVowel(s.charAt(i)))
                count++;
        }
        for(int i=n/2;i<n;i++){
            if(isVowel(s.charAt(i)))
                count--;
        }
        return count == 0;
    }
    static boolean isVowel(char c){
        switch(c){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                return true;                    
        }
        return false;
    }
}
