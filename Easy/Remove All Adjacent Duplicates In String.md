## 1047. Remove All Adjacent Duplicates In String
Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

```java
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for(char c: s.toCharArray()){
            if(stack.isEmpty())
                stack.push(c);
            else if(stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
```
