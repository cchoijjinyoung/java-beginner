package study.boj;

import java.util.Stack;

public class StackExam1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // o
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(1); // o
        System.out.println(stack.search(1)); // 1 (거리 반환)
        stack.pop();
        System.out.println(stack.search(1)); // 4 (거리 반환)
    }
}
