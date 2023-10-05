package study.prgrmrs.test.practice.five;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        System.out.println(solution("imfinethankyou", "atfhinemnoyuki"));
    }

    public static boolean solution(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        for (char c1 : arrS) {
            for (char c2 : arrT) {
                if (c1 != c2) {
                    return false;
                }
            }
        }
        return true;
    }
}
