/*
Problem Name: 1282. Group the People Given the Group Size They Belong To
Problem Link: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
*/
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(groupSizes[i]))
                map.get(groupSizes[i]).add(i);
            else{
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(groupSizes[i], list);
            }
        }
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        for(int key: map.keySet()){
            List<Integer> group = map.get(key);
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<group.size();i++){
                temp.add(group.get(i));
                if(temp.size() == key){
                    answer.add(new ArrayList<>(temp));
                    temp.clear();
                }
            }
        }
        return answer;
    }
}
