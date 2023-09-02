package study.prgrmrs.test.Test_03_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution(5, 3);
    }

    public static int solution(int n, int k) {
        int answer = 0;
        int[][] dp = new int[n + 1][k + 1];

        int divide = 1_000_000_007;
        if (n == 1 || n == 2) {
            return 1 % divide;
        }
        if (k == 1) {
            return 0 % divide;
        }
        dp[1][1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < k; j++) {
                dp[i][j] += dp[i - 1][j];
            }
        }

        return answer;
    }
}
