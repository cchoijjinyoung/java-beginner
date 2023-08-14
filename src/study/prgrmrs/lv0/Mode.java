package study.prgrmrs.lv0;

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,3,3,4});
        solution(new int[]{1,1,2,2});
        solution(new int[]{1});
    }

    public static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int maxValue = 0;
        int cnt = 0;

        for (int i : array) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxValue) {
                max = entry.getKey();
                maxValue = entry.getValue();
                cnt = 0;
            } else if (entry.getValue() == maxValue) {
                cnt++;
            }
        }

        if (cnt == 0) answer = max;
        else if (cnt != 0) answer =  -1;

        return answer;
    }
}
