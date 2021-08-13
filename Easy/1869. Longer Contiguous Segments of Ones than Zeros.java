/*
Problem Name: 1869. Longer Contiguous Segments of Ones than Zeros
Problem Link: https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
*/
class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0, zero = 0, n = s.length(), count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '0'){
                count = 0;
                while(i<n && s.charAt(i) == '0'){
                    i++;
                    count++;
                }
                zero = Math.max(zero, count);
                i--;
            }
            else{
                count = 0;
                while(i<n && s.charAt(i) == '1'){
                    i++;
                    count++;
                    System.out.println(i+" "+count);
                }
                one = Math.max(one, count);
                i--;
            }
        }
        return one > zero;
    }
}
