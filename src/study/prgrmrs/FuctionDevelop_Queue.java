package study.prgrmrs;

import java.util.*;

public class FuctionDevelop_Queue {
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
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int days = 0;
            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                days++;
            }
            queue.offer(days);
        }
        int currentDay = queue.poll();
        int cnt = 1;

        while (!queue.isEmpty()) {
            if (queue.peek() > currentDay) {
                answer.add(cnt);
                currentDay = queue.poll();
                cnt = 1;
            } else {
                queue.poll();
                cnt++;
            }
        }
        answer.add(cnt);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
