/*
Problem Name: 1742. Maximum Number of Balls in a Box
Problem Link: https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
Difficulty: Easy
*/
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(;lowLimit <= highLimit; lowLimit++){
            count = numCount(lowLimit);
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        return Collections.max(map.values());
    }
    int numCount(int num){
        int n = 0;
        while(num > 0){
            n += num%10;
            num /= 10;
        }
        return n;
    }
}
