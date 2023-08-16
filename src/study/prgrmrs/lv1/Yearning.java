package study.prgrmrs.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class Yearning {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
            };
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (hm.get(photo[i][j]) != null) {
                    sum += hm.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        System.out.println(Arrays.toString(answer));
    }
}
