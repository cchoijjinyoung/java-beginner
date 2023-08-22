package study.prgrmrs.test;

import java.util.*;

public class Test02_3_2 {

    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] nums = {1, 3, 4, 8};
        for (int i = 1; i <= nums.length; i++) {
            hm.put(i, hm.getOrDefault(i, 0));
            hm.put(nums[i - 1], hm.getOrDefault(nums[i - 1], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 0) {
                list.add(entry.getKey());
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        System.out.println(answer);
    }
}
