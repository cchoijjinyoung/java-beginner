package study.prgrmrs.month_test.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] pps = new int[M];
        int[] sps = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int pp = Integer.parseInt(st.nextToken());
            int sp = Integer.parseInt(st.nextToken());
            pps[i] = pp;
            sps[i] = sp;
        }

        Arrays.sort(pps);
        Arrays.sort(sps);

        if (sps[0] * 6 <= pps[0]) {
            System.out.println(N * sps[0]);
            return;
        }

        int p = N / 6;
        int s = N % 6;
        if (s * sps[0] < pps[0]) {
            System.out.println(p * pps[0] + s * sps[0]);
            return;
        }

        if (s * sps[0] >= pps[0]) {
            System.out.println((p + 1) * pps[0]);
        }
    }
}
