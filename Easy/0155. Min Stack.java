/*
Problem Name: 155. Min Stack
Problem Link: https://leetcode.com/problems/min-stack/
*/
class MinStack {
    Stack<Integer> st, min;
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    
    public void push(int x) {
        st.push(x);
        if(min.isEmpty())
            min.push(x);
        else if(x < min.peek())
            min.push(x);
        else
            min.push(min.peek());
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
