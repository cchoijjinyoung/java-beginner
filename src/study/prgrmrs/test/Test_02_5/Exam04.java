package study.prgrmrs.test.Test_02_5;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class Exam04 {
    public static void main(String[] args) {
        final int divide = 1_000_000_007;
        int answer = 0;
        long sum = 0;
        long pow = 1;
        int n = 5;
        for (int i = 0; i < n; i++) {
            pow = (pow * 2) % divide;
            sum = (sum + pow) % divide;
        }
        answer = (int) sum;
        System.out.println(answer);
    }
}
