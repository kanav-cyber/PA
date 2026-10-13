class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> q = new Stack<>();
        for(int i=0;i<operations.length;i++){
           
            if(operations[i].equals("D")){
                int front = q.peek();
                q.push(front * 2);
            }
            else if(operations[i].equals("C")){
                q.pop();
            }
            else if(operations[i].equals("+")){
                int front = q.pop();
                int scnd = q.peek();
                q.push(front);
                q.push(front + scnd); 
            }
            else{
                q.push(Integer.parseInt(operations[i]));
            }
        }
        int sum  = 0;
        while(!q.isEmpty()){
            sum+=q.pop();
        }
        return sum;
    }
}