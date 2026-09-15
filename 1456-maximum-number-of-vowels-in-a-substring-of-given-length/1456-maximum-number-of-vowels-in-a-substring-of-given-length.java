class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int mx_cnt = 0;
        int n = s.length();
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o'|| ch == 'u'){
                count++;
            }
        }

        mx_cnt = count;

        for(int i = k;i < n;i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch =='o'|| ch == 'u'){
                count++;
            }

            char out = s.charAt(i - k);
            if(out == 'a'|| out == 'e' || out == 'i' || out =='o'|| out == 'u'){
                count--;
            }

            mx_cnt = Math.max(mx_cnt,count);
            
        }
        return mx_cnt;
    }
}