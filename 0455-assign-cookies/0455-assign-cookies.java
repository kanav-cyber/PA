class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt = 0;
        int left = 0;
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(left < s.length && i < g.length){
            if(s[left] >= g[i]){
                cnt++;
                i++;
            }
            left++;
        }
        return cnt;
    }
}