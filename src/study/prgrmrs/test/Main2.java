package study.prgrmrs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        String s = "Hello, World!?aasdw";
        Stack<Character> stack = new Stack();
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == ' ' || s.charAt(i) == '!' || s.charAt(i) == '?' || i == s.length()) {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                if (!sb.toString().equals("")) {
                    list.add(sb.toString());
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

