package study.boj.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * BFS 로 풀게되면
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 0
 * 과 같이 1로만 되어있으면 상당히 많은 경로가 탄생한다.
 * 공식은 (2N)! / N! * N!
 * 이 예제로는 20이 나온다.
 */
public class Boj_1890_BFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        int[][] A = new int[N][N];

        // A[][] 배열에 담기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // x, y 좌표
        int X = 0;
        int Y = 0;

        // start는 [0][0]
        int start = A[0][0];
        q.add(start);
        qx.add(X);
        qy.add(Y);
        while (!q.isEmpty()) {
            int cur = q.poll();
            X = qx.poll();
            Y = qy.poll();
            int nextX = X + cur;
            int nextY = Y + cur;

            // right, down 큐에 넣기.
            if (nextX <= N - 1) {
                if (nextX == N - 1 && Y == N - 1) {
                    answer++;
                } else {
                    int right = A[nextX][Y];
                    q.add(right);
                    qx.add(nextX);
                    qy.add(Y);
                }
            }
            if (nextY <= N - 1) {
                if (X == N - 1 && nextY == N - 1) {
                    answer++;
                } else {
                    int down = A[X][nextY];
                    q.add(down);
                    qx.add(X);
                    qy.add(nextY);
                }
            }
        }
        System.out.println(answer);
    }
}
