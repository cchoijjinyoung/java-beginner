package study.prgrmrs.test.practice.five;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        solution(new int[]{9, 5, 34, 3, 30, });
    }

    public static String solution(int[] numbers) {
        String answer = "";

        return answer;
    }

    public class Number implements Comparable<Number> {
        String value;

        @Override
        public int compareTo(Number anotherNumber) {
            char thisFront = this.value.charAt(0);
            char anotherFront = anotherNumber.value.charAt(0);
            int length = Math.min(this.value.length(), anotherNumber.value.length());
            for (int i = 0; i < length; i++) {
                char c1 = this.value.charAt(i);
                char c2 = anotherNumber.value.charAt(i);
                if (c1 != c2) {
                    return c2 - c1;
                }
            }
            int maxLength = Math.max(this.value.length(), anotherNumber.value.length());
            for (int i = length + 1; i < maxLength; i++) {
                
            }
            return 0;
        }
    }
}
