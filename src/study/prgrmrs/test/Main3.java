package study.prgrmrs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] A = {};
        int answer = 0;
        List<Integer> divisors = new ArrayList<>();
        boolean isSuccess = false;
        Arrays.sort(A);

        for (int i = 1; i < A[0] / 2; i++) {
            if (A[0] % i == 0) {
                divisors.add(i);
            }
        }

        for (int j = 0; j < divisors.size(); j++) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] % divisors.get(j) != 0) {
                    isSuccess = false;
                    continue;
                } else {
                    isSuccess = true;
                }
            }
            if (isSuccess) answer = divisors.get(j);
        }
    }
}

