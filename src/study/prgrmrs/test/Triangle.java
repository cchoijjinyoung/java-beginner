package study.prgrmrs.test;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 12, 8, 5, 9};
        //int[] arr = new int[]{1, 2, 5, 60, 50, 7};
        Arrays.sort(arr);

        int x = arr.length - 3;
        int y = arr.length - 2;
        int maxLength = arr.length - 1;

        while (x != -1) {
            if (arr[maxLength] < arr[x] + arr[y]) {
                System.out.println(arr[maxLength] + arr[x] + arr[y]);
                break;
            } else {
                maxLength -= 1;
                y -= 1;
                x -= 1;
            }
        }
    }
}
