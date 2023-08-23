package study.prgrmrs.test.Test_02_4;

import java.util.HashMap;
import java.util.Map;

public class Exam01 {
    public static void main(String[] args) {
        int answer = 0;
        Map<String, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int n = 1;
        int k = 9;
        for (int i = 0; i <= n; i++) {
            String s = String.valueOf(i);
            sb.append(s);
        }
        for (String x : sb.toString().split("")) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        answer = hm.get(String.valueOf(k));
        System.out.println(answer);
    }
}
