package study.prgrmrs.test.Test_03_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        solution(new int[]{});
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] coins = {500, 100, 50, 10};
        int sum = 0;
        int lastIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1000) {
                lastIdx = i;
            }
            sum += arr[i];
        }
        if (lastIdx >= 0) {
            sum -= arr[lastIdx];
            list.add(arr[lastIdx]);
        }

        for (int i = 0; i < coins.length; i++) {
            int cnt = sum / coins[i];
            for (int j = 0; j < cnt; j++) {
                list.add(coins[i]);
            }
            sum %= coins[i];
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
