package study.prgrmrs.test.Test_02_4;

import java.util.HashMap;
import java.util.Map;

public class Exam05 {
    public static void main(String[] args) {
        String[] array = {"n", "nav", "nev"};
        String s = "naver";
        int cnt = 0;

        for (String x : array) {
            if (s.indexOf(x) == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
