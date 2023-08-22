package study.prgrmrs.test;

import java.util.*;

public class Modoo {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 7, 8, 4};
        int[] arr2 = new int[]{2, 4, 6, 8};

        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : arr2) {
            set2.add(i);
        }

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : set1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (int i : set2) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                list.add(entry.getKey());
            }
        }
        int[] answer = {};
        if (list.size() == 0) {
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }
        System.out.println(answer);
    }
}
