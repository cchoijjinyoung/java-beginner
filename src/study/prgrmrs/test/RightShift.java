package study.prgrmrs.test;

import java.util.Arrays;

public class RightShift {

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 4, 3, 0};
        int cnt = 0;
        for (int num : arr) {
            if (num % 2 == 1) {
                cnt++;
            }
        }
        int[] tmp = new int[arr.length + cnt];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                tmp[idx] = arr[i];
                tmp[++idx] = arr[i];
            } else {
                tmp[idx] = arr[i];
            }
            idx++;
        }
        int[] answer = Arrays.copyOf(tmp, arr.length);
    }
}
