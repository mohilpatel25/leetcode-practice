/*
Problem Name: 1694. Reformat Phone Number
Problem Link: https://leetcode.com/problems/reformat-phone-number/
*/
class Solution {
    public String reformatNumber(String number) {
        number = number.replaceAll(" ","").replaceAll("-","");
        return reformat(number);
    }
    static String reformat(String num){
        switch(num.length()){
            case 0,1,2,3:
                return num;
            case 4:
                return num.substring(0, 2) + "-" + num.substring(2);
            default:
                return num.substring(0, 3) + "-" + reformat(num.substring(3));
        }
    }
}
