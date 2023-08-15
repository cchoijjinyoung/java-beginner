package study.prgrmrs;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int answer = 0;
        int[] orders = new int[]{2, 4, 5, 7};
        int n = 3;
        int[] arr = new int[orders[orders.length - 1] + 1];
        Arrays.sort(orders);

        for (int i : orders) {
            arr[i] = 1;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt++;
                if (cnt == n) {
                    answer = i;
                    break;
                }
            }
        }
        if (cnt < n) {
            answer = arr.length - 1 + n - cnt;
        }
        System.out.println(answer);
    }
}