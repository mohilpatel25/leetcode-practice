/*
Problem Name: 71. Simplify Path
Problem Link: https://leetcode.com/problems/simplify-path/
*/
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stck = new Stack<String>();
        String arr[] = path.split("/");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!stck.isEmpty())
                    stck.pop();
            }
            else if(arr[i].equals(".") || arr[i].equals(""));
            else
                stck.push(arr[i]);
        }
        String ans = "";
        while(!stck.isEmpty())
            ans = "/" + stck.pop() + ans;
        return ans.length() > 0 ? ans : "/";
    }
}
