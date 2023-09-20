package study.prgrmrs.month_test.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj_1158 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            for (int i = 0; i < M - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll());
            sb.append(", ");
        }
        sb.append(q.poll());
        sb.append(">");
        System.out.println(sb.toString());
    }
}
