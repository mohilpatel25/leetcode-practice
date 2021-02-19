/*
Problem Name: 202. Happy Number
Problem Link: https://leetcode.com/problems/happy-number/
*/
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        for(;n != 1;){
            sum = 0;
            while(n > 0){
                sum += (n%10)*(n%10);
                n /= 10;
            }
            if(set.contains(sum))
                return false;
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
