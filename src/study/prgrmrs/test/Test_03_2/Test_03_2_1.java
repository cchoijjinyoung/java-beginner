package study.prgrmrs.test.Test_03_2;

import java.util.HashMap;
import java.util.Map;

public class Test_03_2_1 {
    public static void main(String[] args) {
        solution("134246", 4);
    }

    public static int solution(String s, int n) {
        int answer = 0;
        Map<String, Integer> hm = new HashMap<>();
        String[] arr = s.split("");
        for (String str : arr) {
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getKey().equals(Integer.toString(n))) {
                answer = entry.getValue();
            }
        }
        return answer;
    }
}


