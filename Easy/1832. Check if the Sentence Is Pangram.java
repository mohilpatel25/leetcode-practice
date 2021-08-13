/*
Problem Name: 1832. Check if the Sentence Is Pangram
Problem Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
Difficulty: Easy
*/
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            if(sentence.indexOf((char)(i+'a')) < 0)
                return false;
        }
        return true;
    }
}
