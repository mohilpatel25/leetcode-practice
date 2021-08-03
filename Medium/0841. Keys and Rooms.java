/*
Problem Name: 841. Keys and Rooms
Problem Link: https://leetcode.com/problems/keys-and-rooms/
*/
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean visited[] = new boolean[n];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        while(!queue.isEmpty()){
            int curRoom = queue.remove();
            visited[curRoom] = true;
            List<Integer> keys = rooms.get(curRoom);
            for(int k: keys){
                if(!visited[k])
                    queue.add(k);
            }
        }
        boolean visitAll = true;
        for(boolean v: visited)
            visitAll &= v;
        return visitAll;
    }
}
