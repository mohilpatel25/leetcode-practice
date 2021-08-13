/*
Problem Name: 1472. Design Browser History
Problem Link: https://leetcode.com/problems/design-browser-history/
Difficulty: Medium
*/
class BrowserHistory {
    Stack<String> stck1, stck2;
    public BrowserHistory(String homepage) {
        stck1 = new Stack<String>();
        stck2 = new Stack<String>();
        stck1.push(homepage);
    }
    
    public void visit(String url) {
        stck1.push(url);
        stck2.clear();
    }
    
    public String back(int steps) {
        while(steps > 0 && stck1.size() > 1){
            stck2.push(stck1.pop());
            steps--;
        }
        return stck1.peek();
    }
    
    public String forward(int steps) {
        while(steps > 0 && !stck2.isEmpty()){
            stck1.push(stck2.pop());
            steps--;
        }
        return stck1.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
