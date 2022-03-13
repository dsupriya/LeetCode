class MyQueue {

    /** Initialize your data structure here. */
     Stack <Integer> enq;
    Stack <Integer> deq;
    
    public MyQueue() {
         enq = new Stack<Integer>();
         deq = new Stack<Integer>();
        
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        enq.push(x);
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(deq.isEmpty())
        {
            
            while(enq.isEmpty()==false)
            {
                deq.push(enq.pop());
            }
        }
        int t = deq.pop();
        return t;
    }
    
    /** Get the front element. */
    public int peek() {
        if(deq.isEmpty())
        {
            while(enq.isEmpty()==false)
            {
                deq.push(enq.pop());
            }
        }
       return deq.peek();
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(enq.isEmpty()&&deq.isEmpty())
            return true;
        else
            return false;
        
    }
    
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */