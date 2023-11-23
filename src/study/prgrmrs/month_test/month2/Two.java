package study.prgrmrs.month_test.month2;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        solution(5, 3, new int[]{7, 2, 5, 3, 2}, new int[][]{{1, 10}, {3, 5}, {2, 2}});
    }

    public static int[] solution(int N, int K, int[] arr, int[][] queries) {
        int[] answer = new int[K];
        Arrays.sort(arr);

        for (int k = 0; k < K; k++) {

            int lt = 0;
            int rt = arr.length - 1;
            while (true) {
                if (arr[lt] < queries[k][0]) {
                    lt++;
                    continue;
                }
                break;
            }

            while (true) {
                if (arr[rt] > queries[k][1]) {
                    rt--;
                    continue;
                }
                break;
            }
            answer[k] = rt - lt + 1;
        }
        return answer;
    }
}
