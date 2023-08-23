package study.boj.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 11286 : 절댓값 힙
 */
public class Exam03 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (x , y) -> Math.abs(x) == Math.abs(y) ? x - y : Math.abs(x) - Math.abs(y));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N != 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && !pq.isEmpty()) {
                sb.append(pq.poll()).append("\n");
            } else if (x == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
            } else {
                pq.add(x);
            }
            N -= 1;
        }
        System.out.println(sb);
    }
}
