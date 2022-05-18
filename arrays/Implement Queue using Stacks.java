class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
        if(!s1.isEmpty())
            return s1.pop();
        else
            return -1;       
        
    }
    
    public int peek() {
        if(!s1.isEmpty())
            return s1.peek();
        else
            return -1;   
        
    }
    
    public boolean empty() {
        if(!s1.isEmpty())
            return false;
        else
            return true;   
        
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
