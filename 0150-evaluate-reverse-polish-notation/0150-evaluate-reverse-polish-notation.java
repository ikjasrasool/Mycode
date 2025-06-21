import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = s.pop();  // Second operand
                int a = s.pop();  // First operand

                switch (token) {
                    case "+":
                        s.push(a + b);
                        break;
                    case "-":
                        s.push(a - b);
                        break;
                    case "*":
                        s.push(a * b);
                        break;
                    case "/":
                        s.push(a / b);
                        break;
                }
            } else {
                s.push(Integer.parseInt(token)); // Push operand
            }
        }
        
        return s.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
