package study.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Boj_12018 {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> x - y);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            if (P >= L) {
                st = new StringTokenizer(br.readLine()); // 과목 수강현황
                int[] pList = new int[P];
                for (int j = 0; j < P; j++) {
                    pList[j] = (Integer.parseInt(st.nextToken()));
                }
                Arrays.sort(pList);

                int idx = pList.length - L;
                pq.add(pList[idx]);
            } else {
                br.readLine();
                pq.add(1);
            }
        }
        while (!pq.isEmpty()) {
            M -= pq.poll();
            if (M < 0) {
                break;
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
