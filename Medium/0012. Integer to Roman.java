/*
Problem Name: 12. Integer to Roman
Problem Link: https://leetcode.com/problems/integer-to-roman/
*/
class Solution {
    public String intToRoman(int num) {
        String ans = "";
        while(num >= 1000){
            ans += 'M';
            num -= 1000;
        }
        if(num >= 900){
            ans = ans + "CM";
            num -= 900;
        }
        while(num >= 500){
            ans += 'D';
            num -= 500;
        }
        if(num >= 400){
            ans = ans + "CD";
            num -= 400;
        }
        while(num >= 100){
            ans += 'C';
            num -= 100;
        }
        if(num >= 90){
            ans = ans + "XC";
            num -= 90;
        }
        while(num >= 50){
            ans += 'L';
            num -= 50;
        }
        if(num >= 40){
            ans = ans + "XL";
            num -= 40;
        }
        while(num >= 10){
            ans += 'X';
            num -= 10;
        }
        if(num >= 9){
            ans = ans + "IX";
            num -= 9;
        }
        while(num >= 5){
            ans += 'V';
            num -= 5;
        }
        if(num >= 4){
            ans = ans + "IV";
            num -= 4;
        }
        while(num > 0){
            ans += 'I';
            num -= 1;
        }
        return ans;
    }
}
