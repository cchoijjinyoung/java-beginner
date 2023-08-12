package study.boj;

import java.util.LinkedList;
import java.util.Scanner;

class BO_LinkedList {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int M = sc.nextInt();

        int[] targets = new int[M];
        for (int i = 0; i < M; i++) {
            targets[i] = sc.nextInt();
        }

        for (int i = 0; i < targets.length; i++) {
            int target = queue.indexOf(targets[i]);
            int move = 0;
            int leftRange = target - 0;
            int rightRange = queue.size() - target;
            if (leftRange < rightRange) {
                move = leftRange;
                for (int j = 0; j < move; j++) {
                    queue.addLast(queue.pollFirst());
                }
                queue.pollFirst();
            } else {
                move = rightRange;
                for (int j = 0; j < move; j++) {
                    queue.addFirst(queue.pollLast());
                }
                queue.pollFirst();
            }
            result += move;
        }
        System.out.println(result);
    }
}


