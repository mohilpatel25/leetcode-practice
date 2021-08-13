/*
Problem Name: 1451. Rearrange Words in a Sentence
Problem Link: https://leetcode.com/problems/rearrange-words-in-a-sentence/
*/
class Solution {
    public String arrangeWords(String text) {
        String words[] = text.split(" ");
        words[0] = words[0].toLowerCase();
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        return String.join(" ", words);
    }
}
