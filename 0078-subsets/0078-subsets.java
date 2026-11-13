class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generate(nums,temp,list,0);
        return list;
    }
    static void generate(int[] nums, List<Integer> temp,List<List<Integer>> list, int idx){
        if(idx == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        generate(nums,temp,list,idx+1);

        temp.remove(temp.size()-1);
        generate(nums,temp,list,idx+1);

    }   
}