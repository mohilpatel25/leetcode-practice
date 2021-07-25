/*
Problem Name: 84. Largest Rectangle in Histogram
Problem Link: https://leetcode.com/problems/largest-rectangle-in-histogram/
*/
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, max = 0;
        int left[] = new int[n], right[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()])
                st.pop();
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] <= heights[st.peek()])
                st.pop();
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            max = Math.max(max, heights[i]*(right[i] - left[i] - 1));
        }
        return max;
    }
}
