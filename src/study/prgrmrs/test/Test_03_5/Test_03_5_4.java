package study.prgrmrs.test.Test_03_5;

import java.util.Arrays;

public class Test_03_5_4 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5}, 15);
    }

    public static int solution(int[] A, int K) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > K) break;
            answer++;
        }
        return answer;
    }
}
