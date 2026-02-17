class Solution {
    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int evaluate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            String token = tokens[i];
            if(isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(evaluate(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}