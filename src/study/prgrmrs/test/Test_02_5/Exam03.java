package study.prgrmrs.test.Test_02_5;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Exam03 {
    public static void main(String[] args) {
        int answer = 0;
        int[] cards = {4, 8, 6, 1, 2};

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (x, y) -> y - x);

        for (int card : cards) {
            queue.offer(card);
        }

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if (x != y) {
                x = x - y;
                queue.offer(x);
            }
        }
        if (queue.isEmpty()) System.out.println(0);
        answer = queue.poll();
        System.out.println(answer);
    }
}
