class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> tmp;
    public MinStack() {
        stack = new Stack<>();
        tmp = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(tmp.isEmpty() || val<=tmp.peek()){
            tmp.push(val);
        }
    }

    public void pop() {

        if(stack.peek().equals(tmp.peek())){
            tmp.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        
        // int mini = stack.peek();

        // while (!stack.isEmpty()) {
        //     mini = Math.min(mini, stack.peek());
        //     tmp.push(stack.pop());
        // }

        // while (!tmp.isEmpty()) {
        //     stack.push(tmp.pop());
        // }

        return tmp.peek();
    }
}