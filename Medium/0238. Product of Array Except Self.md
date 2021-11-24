## 238. Product of Array Except Self
Link: https://leetcode.com/problems/product-of-array-except-self/submissions/

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int preProduct = 1;
        int answer[] = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = preProduct;
            preProduct *= nums[i];
        }
        preProduct = 1;
        for(int i=n-1;i>=0;i--){
            answer[i] = answer[i]*preProduct;
            preProduct *= nums[i];
        }
        return answer;
    }
}
```
