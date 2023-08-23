package study.boj.codeplus.math_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Exam07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        boolean[] primeArr = new boolean[1000001];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;

        for (int i = 2; i < Math.sqrt(primeArr.length); i++) {
            if (primeArr[i]) {
                for (int j = i * i; j < primeArr.length; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            boolean isProve = false;
            for (int i = 2; i <= n / 2; i++) {
                if (primeArr[i] && primeArr[n - i]) { // 둘 다 소수면
                    sb.append(n + " = " + i + " + " + (n - i)).append("\n");
                    isProve = true;
                    break;
                }
            }

            if (!isProve) {
                sb.append("Goldbach's conjecture is wrong.");
            }
            n = Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}
