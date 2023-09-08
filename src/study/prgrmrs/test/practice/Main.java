package study.prgrmrs.test.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        solution(10, 3, 4, new int[]{3, 3, 4});
    }

    // N : 학생 수
    // M : 교실 수
    // K : 감독관 수
    // capacity[] : 교실 별 수용 가능 인원 수
    public static long solution(int N, int M, int K, int[] capacity) {
        long answer = 1;
        int teacher = P(K, M);
        int sum = 0;
        for (int cnt : capacity) {
            sum += cnt;
        }

        Arrays.sort(capacity);
        for (int i = M - 1; i >= 0; i--) {
            answer *= C(N, capacity[i]);
            for (int j = 0; j < N - sum; j++) {
                answer += C(N, capacity[i] - j) * ((M - 1) * (N - sum));
            }
        }

        answer *= teacher;

        return answer;
    }

    public static long C(int n, int r) {
        long result = 0;
        result = factorial(n) / (factorial(r) * factorial(n - r));
        return result;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int P(int n, int r) {
        int diff = n - r;
        int result = factorial(n) / factorial(diff);
        if (n < r) {
            return 1;
        }
        return result;
    }
}
