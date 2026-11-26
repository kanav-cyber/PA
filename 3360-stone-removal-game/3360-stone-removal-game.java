class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        int check = 0;
        int cnt = 1;
        boolean alice_turn = false;
        while(n >= a){
            if(cnt % 2 == 0){
                if(n >= a){
                    n = n - a;
                    System.out.println(n);
                    alice_turn  = false;
                }
            }
            else{
                if(n >= a){
                    n = n - a;
                    System.out.println(n);
                    alice_turn = true;
                }
            }
            a--;
            cnt++;
        }
        return alice_turn;
    }
}