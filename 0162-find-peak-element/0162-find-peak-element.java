class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int k = nums.length - 1;
        int right = k;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;

    }
}