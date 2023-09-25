package study.prgrmrs.test.practice.three;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        solution(3, new int[][]{{1, 3}, {2, 3}});
    }

    public static int solution(int N, int[][] trust) {
        if (trust.length == 0) {
            return -1;
        }

        for (int i = 1; i <= N; i++) {
            int finalI = i;
            if (Arrays.stream(trust).noneMatch(x -> x[0] == finalI) &&
            Arrays.stream(trust)
                    .filter(x -> x[1] == finalI)
                    .count() == (N - 1)) {
                return finalI;
            }
        }
        return -1;
    }
}
