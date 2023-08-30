package study.boj.exam;

import java.util.List;
import java.util.Scanner;

public class Boj_2167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N + 1][M + 1];

        // 누적 합 배열 만들기
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                int x = sc.nextInt();
                A[i][j] = x;
            }
        }
        // 출력해보기
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < M + 1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // K개의 줄 받고, 좌표 가져오기
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = 0;
            for (int j = a; j <= x; j++) {
                for (int l = b; l <= y; l++) {
                    result += A[j][l];
                }
            }
            System.out.println(result);
        }
    }
}
