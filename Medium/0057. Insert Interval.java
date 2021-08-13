/*
Problem Name: 57. Insert Interval
Problem Link: https://leetcode.com/problems/insert-interval/
*/
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Interval> list = new ArrayList<Interval>();
        int n = intervals.length;
        for(int i=0;i<n;i++)
            list.add(new Interval(intervals[i][0],intervals[i][1]));
        list.add(new Interval(newInterval[0],newInterval[1]));
        Collections.sort(list);
        for(int i=1;i<list.size();i++){
            if(list.get(i).start <= list.get(i-1).end){
                list.get(i-1).end = Math.max(list.get(i).end, list.get(i-1).end);
                list.remove(i);
                i--;
            }
        }
        n = list.size();
        intervals = new int[n][2];
        for(int i=0;i<n;i++){
            intervals[i][0] = list.get(i).start;
            intervals[i][1] = list.get(i).end;
        }
        return intervals;
    }
    class Interval implements Comparable<Interval>{
        int start, end;
        Interval(int s, int e){
            start = s;
            end = e;
        }
        public int compareTo(Interval interval){
            if(interval.start != start)
                return start - interval.start;
            return end - interval.end;
        }
    }
}
