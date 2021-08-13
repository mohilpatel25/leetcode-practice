/*
Problem Name: 1773. Count Items Matching a Rule
Problem Link: https://leetcode.com/problems/count-items-matching-a-rule/
*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if(ruleKey.equals("type"))
            return count(items, ruleValue, 0);
        if(ruleKey.equals("color"))
            return count(items, ruleValue, 1);
        return count(items, ruleValue, 2);
    }
    int count(List<List<String>> items, String value, int index){
        int n = items.size(), cnt = 0;
        for(int i=0;i<n;i++){
            if(items.get(i).get(index).equals(value))
                cnt++;
        }
        return cnt;
    }
}
