package study.prgrmrs.test.Test_03_5;

public class Test_03_5_3 {
    public static void main(String[] args) {
        solution(new int[][]{
                {1},

        });
    }

    public static int solution(int[][] A) {
        int answer = 0;
        int[][] dp = A.clone();
        if (dp.length == 1) {
            return dp[0][0];
        }
        dp[1][0] = dp[0][0] + A[1][0];
        dp[1][1] = dp[0][0] + A[1][1];

        for (int i = 2; i < A.length; i++) {
            dp[i][0] = dp[i - 1][0] + A[i][0];
        }

        for (int i = 2; i < A.length; i++) {
            for (int j = 1; j < A[i].length; j++) {
                if (j == A[i].length - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + A[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + A[i][j];
                }
            }
        }
        int min = 0;
        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            if (dp[dp.length - 1][i] < min) {
                min = dp[dp.length - 1][i];
            }
        }
        answer = min;
        return answer;
    }
}
