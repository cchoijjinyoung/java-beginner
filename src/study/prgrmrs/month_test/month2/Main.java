package study.prgrmrs.month_test.month2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        solution(6,  new int[][]{{0, 0, 0, 0, 0, 0}, {0, 4, 0, 0, 0, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 3, 0, 0, 0, 0}});
    }

    public static int solution(int N, int[][] house) {
        int answer = 0;

        Map<Integer, Point> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] != 0) {
                    hm.put(house[i][j], new Point(i, j));
                }
            }
        }
        int forthBro = 4;
        int targetBro = 1;

        for (int i = 0; i < 4; i++) {
            int distanceX = Math.abs(hm.get(forthBro).x - hm.get(targetBro).x);
            int distanceY = Math.abs(hm.get(forthBro).y - hm.get(targetBro).y);

            answer += distanceX + distanceY;
            forthBro = targetBro;
            targetBro++;
        }
        System.out.println(answer);
        return answer;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
