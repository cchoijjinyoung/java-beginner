package study.prgrmrs.test.practice;

public class Prac01_3 {

    public static void main(String[] args) {
        solution(4, 1, 3);
    }

    public static int solution(int n, int i, int j) {
        int answer = 1;
        int cnt = 0;
        int[][] board = new int[n + 1][n + 1];
        
        while (n > 1) {
            n /= 2;
            cnt++;
        }

        int pow = n / 2;
        if (i > pow) {
            if (j < pow) {

            } else if (j < pow) {

            }
        }
        return answer;
    }
}
