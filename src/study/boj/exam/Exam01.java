package study.boj.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exam01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer>[] tree = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];
        int[] parents = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree[x].add(y);
            tree[y].add(x);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : tree[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parents[next] = cur;
                    queue.add(next);
                }
            }
        }

        for (int i = 2; i < N + 1; i++) {
            System.out.println(parents[i]);
        }
    }
}
