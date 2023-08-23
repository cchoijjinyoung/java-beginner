package study.prgrmrs.test.Test_02_4;

import com.sun.javafx.image.IntPixelGetter;

import java.util.HashMap;
import java.util.Map;

public class Exam04 {
    public static void main(String[] args) {
        int answer = 0;
        int[] nums = new int[]{2, 5, 6, 3, 2, 6, 6, 6};
        Map<Integer, Integer> hm = new HashMap<>();

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int sum = 1;
            if (entry.getValue() >= 2) {
                for (int i = 1; i <= entry.getValue(); i++) {
                    sum *= i;
                }
            }
            answer += sum / 2;
        }
        System.out.println(answer);
    }
}
