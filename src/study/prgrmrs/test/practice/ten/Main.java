package study.prgrmrs.test.practice.ten;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        solution(1);
    }

    public static int solution(int a) {
        int n = 500;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (cur, next) -> {
                    if ((convertToDecimal(cur) - convertToDecimal(next)) < 0) {
                        return -1;
                    } else if ((convertToDecimal(cur) - convertToDecimal(next)) > 0) {
                        return 1;
                    } else if ((convertToDecimal(cur) - convertToDecimal(next)) == 0) {
                        return cur - next;
                    }
                    return 0;
                }
        );

        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }

        List<Integer> list = new ArrayList<>();
        for (Integer integer : pq) {
            list.add(integer);
        }
        int[] answer = pq.stream().mapToInt(Integer::intValue).toArray();
        return n;
    }

    public static double convertToDecimal(int num) {
        String decimalStr = "0." + Integer.toString(num);
        double result = Double.parseDouble(decimalStr);
        return result;
    }
}
