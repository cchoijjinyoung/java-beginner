package study.boj.codeplus.math_basic;

import java.util.Scanner;

public class Boj_1929 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] prime = new int[N + 1];
        prime[0] = 1;
        prime[1] = 1;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime[i] == 1) continue;
            for (int j = i * i; j <= N; j += i) {
                if (prime[j] == 1) continue;
                prime[j] = 1;
            }
        }
        for (int i = M; i <= N; i++) {
            if (prime[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
