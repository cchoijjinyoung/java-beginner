package study.prgrmrs.test.Test_02_5;

import java.math.BigDecimal;
import java.util.PriorityQueue;

public class Exam04 {
    public static void main(String[] args) {
        int answer = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double d = Math.pow(2, i) % 1_000_000_007d;
            sum += d % 1_000_000_007d;
        }

        answer = (int)sum;
        System.out.println(answer);
    }
}
