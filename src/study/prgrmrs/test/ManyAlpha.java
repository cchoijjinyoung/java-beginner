package study.prgrmrs.test;

import java.util.HashMap;
import java.util.Map;

public class ManyAlpha {
    public static void main(String[] args) {
        String s = "google";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        char result = 'z' + 1;
        int max = 0;

        for (char ch : hm.keySet()) {
            if (hm.get(ch) > max) {
                max = hm.get(ch);
                result = ch;
            } else if (hm.get(ch) == max) {
                result = (ch < result) ? ch : result;
            }
        }

        return String.valueOf(result);
    }
}

