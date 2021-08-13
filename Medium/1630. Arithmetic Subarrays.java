/*
Problem Name: 1630. Arithmetic Subarrays
Problem Link: https://leetcode.com/problems/arithmetic-subarrays/
Difficulty: Medium
*/
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> answer = new ArrayList<Boolean>();
        for(int i=0;i<m;i++){
            List<Integer> list = getList(nums, l[i], r[i]);
            answer.add(checkArithmetic(list));
        }
        return answer;
    }
    List<Integer> getList(int[] nums, int l, int r){
        List<Integer> list = new ArrayList<Integer>();
        for(;l<=r;l++)
            list.add(nums[l]);
        Collections.sort(list);
        return list;
    }
    boolean checkArithmetic(List<Integer> list){
        int n = list.size(), diff = list.get(1) - list.get(0);
        for(int i=2;i<n;i++)
            if(list.get(i) - list.get(i-1) != diff)
                return false;
        return true;
    }
}
