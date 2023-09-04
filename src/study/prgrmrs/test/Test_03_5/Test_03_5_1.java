package study.prgrmrs.test.Test_03_5;

public class Test_03_5_1 {
    public static void main(String[] args) {
        solution(15);
    }

    public static int solution(int n) {
        int answer = 0;
        int sum = 0;

        if (n == 1) {
            return 1;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        int rt = 1;
        sum = arr[lt] + arr[rt];
        while (lt <= rt) {
            if (sum > n) {
                sum -= arr[lt];
                lt++;
            } else if (sum < n) {
                rt++;
                if (rt > n - 1) {
                    break;
                }
                sum += arr[rt];
            }

            if (sum == n) {
                answer++;
                sum -= arr[lt];
                lt++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
