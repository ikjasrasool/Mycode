class MinStack {
    int t;
    int mt=-1;
    int[] s=new int[100];
    int[] m=new int[100];
    public MinStack() {
        t=-1;
    }
    
    public void push(int val) {
        t++;
        s[t]=val;
        if(mt==-1 || m[mt]>val)
        {
            mt++;
            m[mt]=val;
        }
    }
    
    public void pop() {
        if(s[t]==m[mt])
        {
            mt--;
        }
        t--;
    }
    
    public int top() {
        return s[t];
    }
    
    public int getMin() {
        return m[mt];
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