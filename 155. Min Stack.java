class MinStack {

    /** initialize your data structure here. */
    Stack <Integer> s;
    Stack<Integer> t;
    int min;
    public MinStack() {
        s= new Stack<Integer>();
        t = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        s.push(x);
        if(min>=x)
        {
            min = x;
            t.push(x);
        }
        
    }
    
    public void pop() {
        int temp = s.pop();
        if(temp==min)
        {
            if(t.size()>0)
            {
                t.pop();
                min = t.size()>0?(int)t.peek():Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
         return (int)s.peek();
    }
    
    public int getMin() {
     return min;   
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
