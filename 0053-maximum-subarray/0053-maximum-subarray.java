class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int cur_sum = 0;
        int max_sum = nums[0];
        for(int right = 0;right < nums.length;right++){
            cur_sum += nums[right];
            max_sum = Math.max(cur_sum , max_sum);

            while(cur_sum < 0){
                cur_sum -= nums[left];
                left++;
            }
        }
        return max_sum;
    }
}