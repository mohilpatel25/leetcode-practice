/*
Problem Name: 1529. Bulb Switcher IV
Problem Link: https://leetcode.com/problems/bulb-switcher-iv/
Difficulty: Medium
*/
class Solution {
    public int minFlips(String target) {
        int lastState = 0, flip = 0;
        for(char c: target.toCharArray()){
            if((c - '0') != lastState){
                flip++;
                lastState ^= 1;
            }
        }
        return flip;
    }
}
