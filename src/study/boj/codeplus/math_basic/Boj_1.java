package study.boj.codeplus.math_basic;

import java.util.Scanner;

public class Boj_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int cnt = 0;
            int prev = 0;
            while (true) {
                cnt++;
                prev = (prev * 10 + 1) % n;
                if (prev == 0) {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}
