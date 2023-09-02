package study.boj.dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            int N = sc.nextInt();
            int[][] dp = new int[K + 1][N + 1];
            int[][] A = new int[K + 1][N + 1];

            for (int j = 1; j <= N; j++) {
                A[0][j] = j;
                dp[0][j] = dp[0][j - 1] + A[0][j];
            }

            for (int j = 1; j <= K; j++) {
                dp[j][1] = 1;
                A[j][1] = 1;
                for (int l = 2; l <= N; l++) {
                    A[j][l] = dp[j - 1][l];
                    dp[j][l] = dp[j][l - 1] + A[j][l];
                }
            }
            System.out.println(A[K][N]);
        }
    }
}
