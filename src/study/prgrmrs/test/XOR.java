package study.prgrmrs.test;

import java.util.HashMap;

public class XOR {
    public static void main(String[] args) {
        String[] arr = {"0", "1010", "11110"};
        int answer = 0;
        int maxIdx = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char c = arr[i].charAt(arr[i].length() - 1 - j);
                if (c == '1') {
                    hm.put(j, hm.getOrDefault(j, 0) + 1);
                }
                if (maxIdx < j) maxIdx = j;
            }
        }
        for (int i = 0; i <= maxIdx; i++) {
            if (hm.get(i) != null && hm.get(i) % 2 == 1) {
                System.out.println(hm.get(i));
                System.out.println("i :" + i);
                answer += Math.pow(2, i);
            }
        }
        System.out.println(answer);
    }
}