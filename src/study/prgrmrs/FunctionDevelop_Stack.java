package study.prgrmrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FunctionDevelop_Stack {
    public static void main(String[] args) {
        int[] progresses1 = new int[]{93, 30, 55};
        int[] speeds1 = new int[]{1, 30, 5};
        solution(progresses1, speeds1);
        System.out.println();

        int[] progresses2 = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds2 = new int[]{1, 1, 1, 1, 1, 1};
        solution(progresses2, speeds2);

    }

    public static void solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = progresses.length - 1; i >= 0; i--) {
            int days = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                days++;
            }
            stack.add(days);
        }
        int day = stack.pop();
        int cnt = 1;

        while (!stack.empty()) {
            if (stack.peek() <= day) {
                stack.pop();
                cnt++;
            } else {
                answer.add(cnt);
                day = stack.pop();
                cnt = 1;
            }
        }
        answer.add(cnt);
//        for (int x : answer) {
//            System.out.print(x + " ");
//        }
    }
}
