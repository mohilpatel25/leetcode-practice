/*
Problem Name: 901. Online Stock Span
Problem Link: https://leetcode.com/problems/online-stock-span/
Difficulty: Medium
*/
class StockSpanner {
    Stack<Pair<Integer,Integer>> stck;
    public StockSpanner() {
        stck = new Stack<Pair<Integer,Integer>>();
    }
    
    public int next(int price) {
        int span = 0;
        while(!stck.isEmpty() && stck.peek().getKey() <= price){
            span += stck.pop().getValue();
        }
        stck.push(new Pair(price, span + 1));
        return span + 1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
