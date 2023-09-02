package study.prgrmrs.test.Test_03_4;

import java.util.Arrays;

public class Test_03_4_2 {
    public static void main(String[] args) {
        solution(new int[]{});
    }

    public static int solution(int[] A) {
        int answer = 0;
        int[] dp = new int[A.length + 1];
        dp[0] = A[0];
        for (int i = 1; i <= A.length; i++) {
            dp[i] = dp[i - 1] + A[i];
            if (dp[i] < 0) {
                dp[i] = 0;
            }
        }
        Arrays.sort(dp);
        answer = dp[dp.length - 1];
        return answer;
    }
}
