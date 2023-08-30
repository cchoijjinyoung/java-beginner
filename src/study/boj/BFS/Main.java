package study.boj.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static char[][] miro;
    static int[][] dist;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Pair> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new char[N][M];
        dist = new int[N][M];
        q = new LinkedList<>();

        // 배열에 담는다.
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = line.charAt(j);
                dist[i][j] = -1;
            }
        }
        q.offer(new Pair(0, 0));
        dist[0][0] = 0;

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nX = cur.x + dx[i];
                int nY = cur.y + dy[i];

                // 배열 밖으로 나가면 continue;
                if (nX < 0 || nX >= N || nY < 0 || nY >= M) {
                    continue;
                }
                // 좌표가 0이거나 방문했었으면 continue;
                if (miro[nX][nY] == '0' || dist[nX][nY] != -1) {
                    continue;
                }

                q.offer(new Pair(nX, nY));
                dist[nX][nY] = dist[cur.x][cur.y] + 1;
            }
        }
        System.out.println(dist[N - 1][M - 1] + 1);
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
