package study.prgrmrs.month_test.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Boj_2217 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }

        Arrays.sort(weights);

        int max = 0;
        for (int i = weights.length - 1; i >= 0; i--) {
            if (max < weights[i] * (weights.length - i)) {
                max = weights[i] * (weights.length - i);
            }
        }
        System.out.println(max);

    }

}
