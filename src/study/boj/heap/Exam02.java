package study.boj.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 1972 : 최소 힙
 */
public class Exam02 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> pq = new PriorityQueue<>((x , y) -> x - y);
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
