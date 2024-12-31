class MinStack {
    Stack<Integer> k;
    Stack<Integer> l;

    public MinStack() {
        k = new Stack<>();
        l = new Stack<>();
    }
    
    public void push(int val) {
        k.push(val);
        if(l.isEmpty() || l.peek()>val)
        {
            l.push(val);
        }
        else
        {
            l.push(l.peek());
        }
    }
    
    public void pop() {
        k.pop();
        l.pop();
    }
    
    public int top() {
        return k.peek();
    }
    
    public int getMin() {
        return l.peek();
        
    }
}