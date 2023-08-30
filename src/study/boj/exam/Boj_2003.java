package study.boj.exam;

import java.util.Scanner;

public class Boj_2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 0;

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int lt = 0;
        int rt = 0;
        int sum = A[lt];
        while (rt <= A.length - 1) {
            if (sum > M) {
                sum -= A[lt];
                lt++;
            } else if (sum < M) {
                rt++;
                if (rt > A.length - 1) {
                    break;
                }
                sum += A[rt];
            } else {
                answer++;
                sum -= A[lt];
                lt++;
                rt++;
                if (rt > A.length - 1) {
                    break;
                }
                sum += A[rt];
            }
        }
        System.out.println(answer);
    }
}
