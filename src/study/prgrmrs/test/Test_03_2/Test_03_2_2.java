package study.prgrmrs.test.Test_03_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_03_2_2 {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 6, 9, 12}, new int[]{2, 4, 6, 8, 10, 12});
    }

    public static int[] solution(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr1) {
            for (int y : arr2) {
                if (x == y) {
                    list.add(x);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}


