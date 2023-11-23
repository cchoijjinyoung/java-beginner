package study.prgrmrs.test.practice.Eight;

import java.util.Arrays;
import java.util.PriorityQueue;

public class One {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 10, 6, 5},
        new int[]{5, 6, 12, 9, 12}, new int[]{10, 40, 30, 20, 50}));

    }

    public static int solution(int[] start, int[] end, int[] price) {
        int answer = 0;
        PriorityQueue<Schedule> pq = new PriorityQueue<>(
                (a, b) -> {
                    return b.start - a.start;
                }
        );

        int DP_LEN = Arrays.stream(end).max().getAsInt() + 1;
        boolean[] visited = new boolean[start.length];
        int[] dp = new int[DP_LEN];

        for (int i = 0; i < start.length; i++) {
            pq.add(new Schedule(start[i], end[i], price[i]));
        }

        while (!pq.isEmpty()) {
            Schedule cur = pq.poll();
            int curPrice = cur.price + dp[cur.end];
            if (curPrice > dp[cur.start]) {
                dp[cur.start] = curPrice;
            }
            if (!pq.isEmpty()) {
                Schedule next = pq.peek();
                for (int i = 0; i < cur.start - next.start - 1; i++) {
                    dp[cur.start - 1 - i] = curPrice;
                }
            }

            if (dp[cur.start] > answer) {
                answer = dp[cur.start];
            }
        }

        return answer;
    }

    static class Schedule {
        int start;
        int end;
        int price;

        public Schedule(int start, int end, int price) {
            this.start = start;
            this.end = end;
            this.price = price;
        }
    }
}
