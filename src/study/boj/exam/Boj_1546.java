package study.boj.exam;

import java.util.Scanner;

public class Boj_1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
            sum += x;
        }
        System.out.println(sum / max * 100 / N);
    }
}
