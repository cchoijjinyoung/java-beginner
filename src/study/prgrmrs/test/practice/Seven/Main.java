package study.prgrmrs.test.practice.Seven;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String solution(int[][] img) {
        String answer = "";

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {

            }
        }

        int[] isRight = {0, 1, 0, 1};
        int[] isDown = {0, 0, 1, 1};
        int segment = 0;

        int imgLength = img.length;
        check(img, segment, imgLength, isRight[segment], isDown[segment]);
        return answer;

    }

    private static void check(int[][] img, int segment, int imgLength, int isRight, int isDown) {
        if (imgLength == 0) {

        }
        int x = 0;
        int y = 0;
        for (; x < imgLength; x++) {
            for (; y < imgLength; y++) {
                if (img[x][y] != 0) {
                    check(img, 0, imgLength / 2, isRight, isDown);
                }
            }
        }
    }

    public static int test() {
        int[] votes = {1, 4, 2, 2, 2, 3, 2, 2, 1};
        int answer = 0;
        int overNum = votes.length / 2;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < votes.length; i++) {
            hm.put(votes[i], hm.getOrDefault(votes[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > overNum) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
