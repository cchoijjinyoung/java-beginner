package study.boj.greedy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Boj_2891 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt();
        int S = sc.nextInt();
        int R = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            hm.put(i, 1);
        }

        for (int i = 0; i < S; i++) {
            int x = sc.nextInt();
            hm.put(x, 0);
        }

        for (int i = 0; i < R; i++) {
            int x = sc.nextInt();
            hm.put(x, hm.get(x) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                int cur = entry.getKey();
                int pre = entry.getKey() - 1;
                int next = entry.getKey() + 1;
                if (hm.get(pre) != null && hm.get(pre) == 0) {
                    answer -= 1;
                    hm.put(cur, hm.get(cur) - 1);
                    hm.put(pre, hm.get(pre) + 1);
                } else if (hm.get(next) != null && hm.get(next) == 0) {
                    hm.put(cur, hm.get(cur) - 1);
                    hm.put(next, hm.get(next) + 1);
                }
            } else if (entry.getValue() == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
