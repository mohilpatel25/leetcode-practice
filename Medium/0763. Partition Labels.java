/*
Problem Name: 763. Partition Labels
Problem Link: https://leetcode.com/problems/partition-labels/
*/
class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int n = s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i), i);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            StringBuilder str = new StringBuilder();
            int last = map.get(s.charAt(i));
            for(int j=i;j<=last;j++){
                char c = s.charAt(j);
                str.append(c);
                last = Math.max(last, map.get(c));
            }
            i = last;
            list.add(str.length());
        }
        return list;
    }
}
