/*
Problem Name: 204. Count Primes
Problem Link: https://leetcode.com/problems/count-primes/
*/
class Solution {
    public int countPrimes(int n) {
        if(n <= 1)
            return 0;
        int[] prime = new int[n];
        for(int i=2;i<n;i++){
            if(prime[i] == 0){
                for(int j=2*i;j<n;j+=i)
                    prime[j] = 1;
            }
        }
        int cnt = 0;
        for(int i=2;i<n;i++)
            if(prime[i] == 0)
                cnt++;
        return cnt;
    }
}
