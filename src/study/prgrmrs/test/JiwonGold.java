package study.prgrmrs.test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class JiwonGold {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 3, 20};
        int[] arr2 = new int[]{9, 4, 7, 5, 10, 4};
        PriorityQueue<Integer> pq = new PriorityQueue<>((x , y) -> x - y);

        for (int num : arr) {
            pq.offer(num);
        }
        pq.poll();

        int sum = 0;
        while (pq.size() > 1) {
            sum += pq.poll();
        }
        int answer = sum / (arr.length - 2);
        System.out.println(answer);
    }
}
