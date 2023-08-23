package study.prgrmrs.test.Test_02_4;

import java.util.*;

public class Exam02 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int answer = 0;
        int K = 5;

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    pq.add(A[i] * 10 + A[j]);
                }
            }
        }
        for (int i = 0; i < K - 1; i++) {
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
