class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] arr = new int[nums.length];
        for(int i = 2*n-1;i >= 0;i--){
            int idx = i % n;
            while(!st.isEmpty() && nums[st.peek()] <= nums[idx]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                arr[idx] = nums[st.peek()];
            }else{
                arr[idx] = -1;
            }
            st.push(idx);
        }
        return arr;
    }
}