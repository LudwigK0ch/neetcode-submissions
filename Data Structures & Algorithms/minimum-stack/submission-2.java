class MinStack {
    Deque<Integer> min;
    Deque<Integer> stack;
    public MinStack() {
        min = new ArrayDeque<Integer>();
        stack = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        int newMin = min.size() > 0 ? Math.min(min.peekFirst(), val) : val;
        min.addFirst(newMin);
    }
    
    public void pop() {
        stack.removeFirst();
        min.removeFirst();
    }
    
    public int top() {
        return stack.peekFirst();
    }
    
    public int getMin() {
        return min.peekFirst();
    }
}
