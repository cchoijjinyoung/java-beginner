package study.prgrmrs.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Test02_3_1 {

    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        String s = "221123";
        s += "0123456789";
        for (String str : s.split("")) {
            int x = Integer.parseInt(str);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((x, y) -> y.getValue() == x.getValue() ?
                x.getKey() - y.getKey() : y.getValue() - x.getValue());

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.offer(entry);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll().getKey());
        }
        String answer = sb.toString();
        System.out.println(sb.toString());
    }
}
