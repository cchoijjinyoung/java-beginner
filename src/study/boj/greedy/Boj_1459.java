package study.boj.greedy;

import java.io.IOException;
import java.util.Scanner;

public class Boj_1459 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long answer = 0;
        long X = sc.nextInt();
        long Y = sc.nextInt();
        int W = sc.nextInt();
        int S = sc.nextInt();

        if (2 * W > S) {
            // 대각선이 더 이득이다.
            long sCnt = Math.min(X, Y);
            answer += S * sCnt;
            X -= sCnt;
            Y -= sCnt;
            if (W > S) {
                long max = Math.max(X, Y);
                sCnt = (max / 2) * 2;
                X %= 2;
                Y %= 2;
                answer += S * sCnt;
                answer += (X + Y) * W;
            } else {
                answer += (X + Y) * W;
            }
        } else {
            answer += (X + Y) * W;
        }
        System.out.println(answer);
    }
}
