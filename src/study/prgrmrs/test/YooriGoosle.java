package study.prgrmrs.test;

import java.util.HashMap;
import java.util.Map;

public class YooriGoosle {

    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {1, 2, 1};
        Map<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                answer = entry.getKey();
                break;
            }
        }
        System.out.println(answer);
    }
}
