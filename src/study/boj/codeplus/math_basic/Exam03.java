package study.boj.codeplus.math_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        final int maxValue = 1_000_000;
        long fx[] = new long[1000001];
        long gx[] = new long[1000001];

        Arrays.fill(fx, 1);

        for (int i = 2; i < fx.length; i++) {
            for (int j = 1; j * i <= maxValue; j++) {
                fx[i * j] += i;
            }
        }

        for (int i = 1; i < gx.length; i++) {
            gx[i] += gx[i - 1] + fx[i];
        }

        while (N > 0) {
            int input = Integer.parseInt(br.readLine());
            sb.append(gx[input]).append("\n");
            N -= 1;
        }
        System.out.println(sb);
    }
}
