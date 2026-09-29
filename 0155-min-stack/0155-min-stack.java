class MinStack {
    Stack<Integer>st;
    Stack<Integer>Minstack;
    public MinStack() {
        st = new Stack<>();
        Minstack = new Stack<>();
    }
    
    public void push(int value) {   
        st.push(value);

        if(Minstack.isEmpty()){
            Minstack.push(value);
        }
        else{
            Minstack.push(Math.min(value,Minstack.peek()));
        }

    }
    
    public void pop() {
        st.pop();
        Minstack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return Minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */