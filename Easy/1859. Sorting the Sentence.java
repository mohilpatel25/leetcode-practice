/*
Problem Name: 1859. Sorting the Sentence
Problem Link: https://leetcode.com/problems/sorting-the-sentence/
*/
class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" "), sorted[] = new String[arr.length];
        for(String str: arr){
            sorted[str.charAt(str.length()-1) - '0' - 1] = str.substring(0, str.length()-1);
        }
        return String.join(" ", sorted);
    }
}
