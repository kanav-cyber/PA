
class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            }
            else{
                if(i + 1 >= s.length() || s.charAt(i + 1) != ')'){
                    cnt++;
                }
                else{
                    i++;
                }

                if(open == 0){
                    cnt++;
                }else{
                    open--;
                }
            }
        }

        cnt += open * 2;
        return cnt;
    }
}
