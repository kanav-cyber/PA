class Solution {
    public int[] concatWithReverse(int[] nums) {
        int k = nums.length;
        int check = k + k;
        int[] num2 = new int[check];
        for(int i=0;i<nums.length;i++){
            num2[i] = nums[i];
        }
        int it = k - 1;
        for(int i = k;i<num2.length;i++){
            num2[i] = nums[it];
            it--;
        }
        return num2;
    }
}