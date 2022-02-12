class MinStack {
    
    Stack<Integer> stack ;
    int min ;

    // constructor
    public MinStack() {
        
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
        
    }
    
    // making stack in decreasing order (grater to smaller)
    public void push(int val) {
        
      // track minimum element
        if(val <= min){
            // push greater one in stack
            stack.push(min);
            // track smaller one
            min = val;
        }
        
        stack.push(val);
        
        
    }
    
    public void pop() {
        
        if(stack.peek() == min){
            stack.pop();
            min = stack.pop();
        }
        else{
            stack.pop();
        }
        
    }
    
    public int top() {
        
         return stack.peek();
    }
    
    public int getMin() {
        
        return min;
    
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */