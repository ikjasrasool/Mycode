class MinStack {
    int t;
    int mt = -1;
    int[] s = new int[10000]; // increased size for safety
    int[] m = new int[10000];

    public MinStack() {
        t = -1;
    }

    public void push(int val) {
        s[++t] = val;
        if (mt == -1 || m[mt] >= val) {
            m[++mt] = val;
        }
    }

    public void pop() {
        if (t == -1) return; // prevent pop on empty stack
        if (s[t] == m[mt]) {
            mt--;
        }
        t--;
    }

    public int top() {
        if (t == -1) throw new RuntimeException("Stack is empty");
        return s[t];
    }

    public int getMin() {
        if (mt == -1) throw new RuntimeException("Min stack is empty");
        return m[mt];
    }
}
