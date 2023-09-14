package study.prgrmrs.test.practice.two;

import java.util.Stack;

public class Exam2 {
    public static void main(String[] args) {
        solution(new int[]{1}, new int[]{9,9,9,9,9,9,9,9,9,9,9});
    }

    public static int[] solution(int[] a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        int up = 0;
        if (a.length < b.length) {
            int[] tmp;
            tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = 0; i < b.length; i++) {
            int sum = a[a.length - 1 - i] + b[b.length - 1 - i];
            if (up == 1) {
                sum++;
            }
            up = 0;
            if (sum >= 10) {
                up = 1;
            }
            stack.push(sum % 10);
        }
        int idx = a.length - b.length - 1;
        while (idx >= 0) {
            int sum = a[idx] + up;
            if (sum == 10) {
                up = 1;
                stack.push(sum % 10);
            } else {
                up = 0;
                stack.push(sum % 10);
            }
            idx--;
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}