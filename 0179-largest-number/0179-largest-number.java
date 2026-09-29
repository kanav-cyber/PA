class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<str.length;i++){
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str , (a,b) -> {
            return (b + a).compareTo(a + b);
        });

        StringBuilder res = new StringBuilder();
        for(String s : str){
            res.append(s);
        }

        if(res.charAt(0) == '0'){
            return "0";
        }
        return res.toString();
    }
}