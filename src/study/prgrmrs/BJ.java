package study.prgrmrs;

import java.util.HashMap;
import java.util.Map;

public class BJ {
    public static void main(String[] args) {
        String[] bj = new String[]{"혁준", "하밥", "양상", "심심이", "소스왕"};
        String[] one = new String[]{"혁준", "양상"};
        String[] two = new String[]{"심심이", "소스왕"};
        int noodleCnt = 3;
        String winner = "";

        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : bj) {
            hm.put(name, 0);
        }

        for (String name : one) {
            hm.put(name, 1);
            noodleCnt += 1;
        }

        for (String name : two) {
            hm.put(name, 2);
            noodleCnt += 2;
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 0) {
                winner = entry.getKey();
            }
        }
        int sum = 150 * noodleCnt;
        System.out.println(sum + "만원(" + winner + ")");
    }
}
