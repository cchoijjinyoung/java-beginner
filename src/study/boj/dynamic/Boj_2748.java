package study.boj.dynamic;

import java.util.Scanner;

public class Boj_2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fibo = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        System.out.println(fibo[fibo.length - 1]);
    }
}
