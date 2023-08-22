package study.prgrmrs.test;

import java.util.PriorityQueue;

public class electricPrice {

    public static void main(String[] args) {
        int[] usageAArr = new int[]{1, 3, 5};
        int fee = 5;
        int sum = 0;
        for (int i : usageAArr) {
            sum += i;
        }
        int answer = sum * fee;
    }
}
