/*
Problem Name: 1817. Finding the Users Active Minutes
Problem Link: https://leetcode.com/problems/finding-the-users-active-minutes/
Difficulty: Medium
*/
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> map = new HashMap<Integer,Set<Integer>>();
        int n = logs.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(logs[i][0]))
                map.get(logs[i][0]).add(logs[i][1]);
            else{
                Set<Integer> temp = new HashSet<Integer>();
                temp.add(logs[i][1]);
                map.put(logs[i][0], temp);
            }
        }
        int answer[] = new int[k];
        for(Set<Integer> set: map.values()){
            if(set.size() <= k)
                answer[set.size()-1]++;
        }
        return answer;
    }
}
