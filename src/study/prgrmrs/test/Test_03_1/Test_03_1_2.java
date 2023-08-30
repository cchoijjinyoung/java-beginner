package study.prgrmrs.test.Test_03_1;

import java.util.Arrays;

public class Test_03_1_2 {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr.length % 2 == 0) {
                if (arr[i] >= arr[arr.length / 2]) {
                    answer++;
                }
            } else {
                if (arr[i] >= arr[arr.length / 2 + 1]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
