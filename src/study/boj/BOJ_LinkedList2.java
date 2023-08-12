package study.boj;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_LinkedList2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.print("<");
        while (!list.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                list.addLast(list.remove());
            }
            System.out.print(list.remove());
            if (!list.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
