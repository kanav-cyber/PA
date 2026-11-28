class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0;
        for(int i=0;i<worker.length;i++){
            int maxprofit = 0;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j] <= worker[i]){
                    maxprofit = Math.max(maxprofit,profit[j]);
                }
            }
            sum+=maxprofit;
        }
        return sum;
    }
}