package study.prgrmrs.test;

import java.sql.Array;
import java.util.*;

public class HashKoni {
    public static void main(String[] args) {
        solution(new String[][]{
                {"yellow_hat", "headgear"}
            , {"blue_sunglasses", "eyewear"}
            , {"green_turban", "headgear"}
         });

//        solution(new String[][]{
//                {"crow_mask", "face"}
//                , {"blue_sunglasses", "face"}
//                , {"smoky_makeup", "face"}
//        });

    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];

            hm.put(key, hm.getOrDefault(key, 1) + 1);
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            answer *= entry.getValue();
        }

        return answer - 1;
    }
}
