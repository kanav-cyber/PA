class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generate(list,temp,nums,0);
        return list;
    }
    static void generate(List<List<Integer>> list,List<Integer>temp,int[]nums,int idx){
        if(idx == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        generate(list,temp,nums,idx+1);
        temp.remove(temp.size()-1);

        while(idx+1 < nums.length && nums[idx] == nums[idx+1]){ 
            idx++;
        }
        generate(list,temp,nums,idx+1);
    }
}