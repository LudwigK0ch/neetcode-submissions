class MinStack {
    Stack<Integer> min;
    Stack<Integer> st;
    public MinStack() {
        min = new Stack<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        min.push(min.empty() || val < min.peek() ? val : min.peek());
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
