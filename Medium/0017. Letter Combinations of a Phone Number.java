/*
Problem Name: 17. Letter Combinations of a Phone Number
Problem Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.length() == 0)
            return list;
        HashMap<Character,char[]> map = new HashMap<Character,char[]>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        generate(digits, list, map, "");
        return list;
    }
    void generate(String dig, List<String> l, HashMap<Character,char[]> map, String gen){
        if(dig.length() == 0){
            l.add(gen);
            return;
        }
        char arr[] = map.get(dig.charAt(0));
        for(int i=0;i<arr.length;i++){
            generate(dig.substring(1), l, map, gen+arr[i]);
        }
    }
}
