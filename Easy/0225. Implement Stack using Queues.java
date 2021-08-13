/*
Problem Name: 225. Implement Stack using Queues
Problem Link: https://leetcode.com/problems/implement-stack-using-queues/
*/
class MyStack {

    Queue<Integer> q1, q2;
    int top = -1;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size() > 1){
            top = q1.remove();
            q2.add(top);
        }
        int ret = q1.remove();
        q1 = q2;
        q2 = new LinkedList<Integer>();
        return ret;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
