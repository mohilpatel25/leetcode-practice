/*
Problem Name: 89. Gray Code
Problem Link: https://leetcode.com/problems/gray-code/
Difficulty: Medium
*/
class Solution {
    public List<Integer> grayCode(int n) {
        List<String> list = new ArrayList<String>(), temp = new ArrayList<String>();
        list.add("0");
        list.add("1");
        for(int i=1;i<n;i++){
            temp.clear();
            revCopy(list, temp);
            list = append(list, "0");
            temp = append(temp, "1");
            list.addAll(temp);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(String s: list){
            ans.add(Integer.parseInt(s, 2));
        }
        return ans;
    }
    void revCopy(List<String> src, List<String> dest){
        for(String s: src){
            dest.add(0, s);
        }
    }
    List<String> append(List<String> src, String ch){
        List<String> ret = new ArrayList<String>();
        for(String s: src){
            ret.add(ch + s);
        }
        return ret;
    }

}
