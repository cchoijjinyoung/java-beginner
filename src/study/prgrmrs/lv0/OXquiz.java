package study.prgrmrs.lv0;

import java.util.*;

public class OXquiz {
    public static void main(String[] args) {
        solution("abcabcadc");
        solution("abdc");
        solution("hello");
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) sb.append(entry.getKey());
        }
        if (sb.length() == 0) {
            return "";
        }


        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);

        String answer = "";
        return String.valueOf(arr);
    }
}
