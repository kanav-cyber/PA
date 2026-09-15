class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int len = 0;
        int max_len = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch , 0) +1);
            len++;
            while(map.get(ch) > 1){
                char remove = s.charAt(left);
                map.put(remove , map.getOrDefault(remove , 0) -1);
                if(map.get(remove) == 0){
                    map.remove(remove);
                    
                }
                len--;
                left++;
            }
            max_len = Math.max(len,max_len);
        }
        return max_len;
    }
}