package study.prgrmrs.exam;

import java.util.*;

public class Exam01 {

    public static void main(String[] args) {
        solution("dabcabcaxcasc");
    }

    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 'a'; i <= 'z'; i++) {
            if (hm.get((char)i) != null && hm.get((char)i) == 1) {
                sb.append((char)i);
            }
        }
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}

