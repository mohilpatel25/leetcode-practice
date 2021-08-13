/*
Problem Name: 1700. Number of Students Unable to Eat Lunch
Problem Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
Difficulty: Easy
*/
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = students.length, lastSandwich = 0;
        for(int s: students)
            queue.add(s);
        for(int cur=0;queue.size()>0;){
            if(lastSandwich == queue.size())
                return queue.size();
            int choice = queue.remove();
            if(choice == sandwiches[cur]){
                cur++;
                lastSandwich = 0;
            }
            else{
                queue.add(choice);
                lastSandwich++;
            }
        }
        return 0;
    }
}
