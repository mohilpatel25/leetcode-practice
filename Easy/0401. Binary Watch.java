/*
Problem Name: 401. Binary Watch
Problem Link: https://leetcode.com/problems/binary-watch/
Difficulty: Easy
*/
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<String>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(setBits(i) + setBits(j) == turnedOn){
                    list.add(j<10 ? i+":0"+j : i+":"+j);
                }
            }
        }
        return list;
    }
    int setBits(int n){
        int bits = 0;
        while(n>0){
            bits += n&1;
            n >>= 1;
        }
        return bits;
    }
}
