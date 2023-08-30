package study.boj.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_1926 {
    static int N, M;
    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Pair> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];
        queue = new LinkedList<>();

        // 배열 값 세팅
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0 || visited[i][j]) {
                    continue;
                }
                count++; // 그림의 첫 부분이므로
                queue.offer(new Pair(i, j));
                visited[i][j] = true;
                int area = 0;

                while (!queue.isEmpty()) {
                    Pair cur = queue.poll();
                    area++;
                    for (int k = 0; k < 4; k++) { // 4방향 탐색
                        int nextX = cur.x + dx[k];
                        int nextY = cur.y + dy[k];
                        if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) { // 좌표가 배열을 벗어나면
                            continue;
                        }
                        if (A[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                            queue.offer(new Pair(nextX, nextY));
                            visited[nextX][nextY] = true;
                        }
                    }
                }
                // 한 번 큐가 끝나면 area 검사
                if (area > max) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
