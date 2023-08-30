package study.boj.codeplus.bruteforce;

import java.util.Arrays;

public class Exam01 {

    public static void main(String[] args) {
        int[] answer = solution(6, new int[]{13, 5, 11, 7, 23, 15});
        System.out.println(Arrays.toString(answer));

    }

    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
