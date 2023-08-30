package study.boj.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DP로 풀어보자.
 */
public class Boj_1890_DP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long answer = 0;
        int rate = 1;
        int N = Integer.parseInt(br.readLine());
        int[][] A = new int[N][N];
        long[][] dp = new long[N][N];
        // A[][] 배열에 담기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if (A[0][0] > 0) {
            dp[0][0] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == (N - 1) && j == (N - 1)) {
                    break;
                }
                if (dp[0][0] == 0) {
                    break;
                }
                if (dp[i][j] > 0) {
                    int move = A[i][j];
                    if (i + move < N) {
                        dp[i + move][j] += 1 * dp[i][j];
                    }

                    if (j + move < N) {
                        dp[i][j + move] += 1 * dp[i][j];
                    }
                }
//                for (int i1 = 0; i1 < N; i1++) {
//                    System.out.println();
//                    for (int j1 = 0; j1 < N; j1++) {
//                        System.out.print(dp[i1][j1] + " ");
//                    }
//                }
//                System.out.println("--------" + rate++);
            }
        }
        System.out.println(dp[N - 1][N - 1]);
    }
}
