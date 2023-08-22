package study.prgrmrs.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DragonBanana {

    public static void main(String[] args) {
        boolean answer = true;
        Set<String> pattern = new HashSet<>();
        Set<String> strSet = new HashSet<>();

        String p = "가나다라";
        String s = "바나나 드래곤 스리랑카 오염";

        for (String x : p.split("")) {
            pattern.add(x);
        }

        for (String x : s.split(" ")) {
            strSet.add(x);
        }
        if (pattern.size() == strSet.size()) {
            answer = true;
        } else {
            answer = false;
        }
    }
}
