/*
Problem Name: 1656. Design an Ordered Stream
Problem Link: https://leetcode.com/problems/design-an-ordered-stream/
*/
class OrderedStream {
    int ptr;
    HashMap<Integer, String> map;
    public OrderedStream(int n) {
        ptr = 1;
        map = new HashMap<Integer, String>();
    }
    
    public List<String> insert(int idKey, String value) {
        map.put(idKey, value);
        List<String> list = new ArrayList<String>();
        while(map.containsKey(ptr)){
            list.add(map.get(ptr));
            ptr++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
