package study.prgrmrs.test.practice.Eight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(0, 0, new int[][]{{5, 6, 2, 6}, {1, 6, 4, 9}, {5, 6, 9, 4}, {55, 14, 21, 14}}));

    }

    public static int solution(int depth, int n, int[][] blocks) {
        int[][] dp = new int[blocks.length][blocks[0].length];
        for (int i = 0; i < blocks[0].length; i++) {
            dp[0][i] = blocks[0][i];
        }

        for (int i = 1; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                int min = Integer.MIN_VALUE;
                if (j == 0) {
                    min = Math.min(dp[i - 1][0], dp[i - 1][1]);
                } else if (j == blocks[i].length - 1) {
                    min = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                } else {
                    min = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]);
                }
                dp[i][j] = blocks[i][j] + min;
            }
        }
        return dp[depth][n];
    }
}
