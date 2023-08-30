package study.prgrmrs.test.Test_03_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution(new int[]{10, 1, 5}, 5);
    }

    public static int solution(int[] arr, int n) {
        int answer = -1;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= n) {
                answer = arr[i];
                break;
            }
        }
        return answer;
    }
}


