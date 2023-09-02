package study.prgrmrs.test.Test_03_4;

public class Test_03_4_4 {
    public static void main(String[] args) {
        solution(new int[]{});
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int max = 0;
        for (int x : arr) {
            if (x == 0) {
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt++;
            }
        }
        answer = max;
        return answer;
    }
}
