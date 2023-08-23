package study.prgrmrs.test.Test_02_5;

import java.util.LinkedList;
import java.util.Queue;

public class Exam05 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 20, 22, 17};
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        while (!q.isEmpty()) {
            int cur = q.poll();
            int left = cur * 2;
            int right = cur * 2 + 1;
            if (left > arr.length - 1 || right > arr.length - 1) {
               break;
            } else {
                if (arr[left] < arr[cur] || arr[right] < arr[cur]) {
                    System.out.println("NO");
                }
            }
            q.add(left);
            q.add(right);
        }
        System.out.println("YES");
    }
}
