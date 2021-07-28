/*
Problem Name: 1079. Letter Tile Possibilities
Problem Link: https://leetcode.com/problems/letter-tile-possibilities/
*/
class Solution {
    static int count;
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();
        int freq[] = new int[26];
        for(char c: tiles.toCharArray())
            freq[c - 'A']++;
        count = 0;
        countPossibility(freq);
        return count - 1;
    }
    static void countPossibility(int freq[]){
        count++;
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                freq[i]--;
                countPossibility(freq);
                freq[i]++;
            }
        }
    }
}
