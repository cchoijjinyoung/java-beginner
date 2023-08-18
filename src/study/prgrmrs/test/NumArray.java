package study.prgrmrs.test;

import sun.util.resources.cldr.nus.CalendarData_nus_SD;

import java.util.Arrays;

public class NumArray {
    public static void main(String[] args) {
        solution(new int[]{5, 9, 7, 10}, 5);
        solution(new int[]{2, 36, 1, 3}, 1);
        solution(new int[]{3, 2, 6}, 10);
        solution(new int[]{1}, 1);
    }

    // array의 각 element 중 divisor로 나누어 떨어지는 값을
    // 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

    public static int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        String s = "";
        for (int item : arr) {
            if (item % divisor == 0) {
                cnt++;
                s += item + " ";
            }
        }
        if (cnt == 0) {
            System.out.println(cnt);
            return new int[]{-1};
        }

        String[] strArr = s.split(" ");
        int[] answer = new int[strArr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < answer.length; i++) {
            int min = answer[i];
            for (int j = i + 1; j < answer.length; j++) {
                if (min > answer[j]) {
                    min = answer[j];
                    answer[j] = answer[i];
                    answer[i] = min;
                }
            }
        }

         System.out.println(Arrays.toString(answer));
        return answer;

    }
}
