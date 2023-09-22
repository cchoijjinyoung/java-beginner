package study.prgrmrs.test.practice.three;


import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
    public static void main(String[] args) {
        solution(2, 5);
    }

    public static int solution(int delay, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 초기 아메바는 분열까지 1분이 필요

        for (int i = 0; i < N; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int time = queue.poll();
                time -= 1;
                if (time == 0) {
                    queue.add(1);
                    queue.add(delay + 1);
                } else {
                    queue.add(time);
                }
            }
        }
        System.out.println(queue.size());
        return queue.size();
    }
}
