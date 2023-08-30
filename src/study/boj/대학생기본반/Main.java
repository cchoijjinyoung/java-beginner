package study.boj.대학생기본반;

import java.util.Arrays;

public class Main {
    static int max = 1_004_000;
    public static void main(String[] args) {
        int n = 1_000_000;
        boolean[] isPrime = sieve();

        for (int i = n; i <= max; i++) {
            if (isPrime[i]) {
                if (isPalindrom(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean[] sieve() {
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 0; i <= Math.sqrt(max); i++) {
            // i가 소수라면
            if (isPrime[i]) {
                // i의 배수는 모두 소수가 아니므로 false로 설정
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static boolean isPalindrom(int n) {
        String str = Integer.toString(n);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

