/*
Problem Name: 38. Count and Say
Problem Link: https://leetcode.com/problems/count-and-say/
Difficulty: Easy
*/
class Solution {
    public String countAndSay(int n) {
        String say = "1", temp = "";
        int cnt;
        char cur;
        for(int i=2;i<=n;i++){
            temp = "";
            cnt = 1;
            cur = say.charAt(0);
            for(int j=1;j<say.length();j++){
                if(cur == say.charAt(j))
                    cnt++;
                else{
                    temp += "" + cnt + cur;
                    cnt = 1;
                    cur = say.charAt(j);
                }
            }
            temp += "" + cnt + cur;
            say = new String(temp);
        }
        return say;
    }
}
