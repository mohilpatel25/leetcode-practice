/*
Problem Name: 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K
Problem Link: https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
Difficulty: Medium
*/
class Solution {
    public int findMinFibonacciNumbers(int k) {
        int numbers = 0, f1 = 1, f2 = 1;
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(f1);
        fib.add(f2);
        while(f2 <= k){
            int temp = f1 + f2;
            if(temp <= k)
                fib.add(temp);
            f1 = f2;
            f2 = temp;
        }
        f2 = fib.size() - 1;
        while(k > 0){
            if(fib.get(f2) <= k){
                k -= fib.get(f2);
                numbers++;
            }
            else
                f2--;
        }
        return numbers;
    }
}
