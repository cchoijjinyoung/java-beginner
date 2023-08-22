package study.prgrmrs.test;

import java.util.LinkedList;

public class Test02_3_5 {

    public static void main(String[] args) {
        int N = 7;
        int K = 3;

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                list.addLast(list.removeFirst());
            }
            list.remove();
        }
        int answer = list.remove();
        System.out.println(answer);
    }
}
