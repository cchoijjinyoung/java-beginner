package study.prgrmrs;

import java.util.Stack;

public class ABBA {
    public static void main(String[] args) {
        String S = "ABBA";
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty()) answer = 0;
    }
}
