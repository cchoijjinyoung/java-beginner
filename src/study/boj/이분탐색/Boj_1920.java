package study.boj.이분탐색;

import java.util.Scanner;

public class Boj_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] tree = new int[N];

        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();

            if (tree[i] > max) {
                max = tree[i];
            }
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int height : tree) {
                if (height > mid) {
                    sum += (height - mid);
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
