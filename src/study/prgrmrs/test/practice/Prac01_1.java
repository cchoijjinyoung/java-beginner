package study.prgrmrs.test.practice;

public class Prac01_1 {

    public static void main(String[] args) {
        solution(1);
    }

    public static int solution(int n) {
        int answer = 0;
        int[] prime = new int[n + 1];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = i;
        }
        prime[0] = 0;
        prime[1] = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i] != 0) {
                for (int j = i + i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        for (int b : prime) {
            if (b != 0) answer++;
        }
        System.out.println(answer);
        return answer;
    }
}
