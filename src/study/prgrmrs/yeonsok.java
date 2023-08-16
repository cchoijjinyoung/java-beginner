package study.prgrmrs;

import java.util.Stack;

public class yeonsok {
    public static void main(String[] args) {
        String s = "aacddefg";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        char[] arr = new char[stack.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        String answer = String.valueOf(arr);

        System.out.println(answer);
    }
}
