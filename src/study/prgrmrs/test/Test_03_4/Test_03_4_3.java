package study.prgrmrs.test.Test_03_4;

import java.util.*;

public class Test_03_4_3 {
    public static void main(String[] args) {
        int[][] s = solution(new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        });

        for (int[] s1 : s) {
            System.out.println();
            for (int s2 : s1) {
                System.out.print(s2 + " ");
            }
        }
    }

    public static int[][] solution(int[][] n) {
        int[][] answer = new int[n.length][n[0].length];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int cnt = 0;
        List<Point> stations = new ArrayList<>();
        boolean[][] visited = new boolean[n.length][n[0].length];
        Queue<Point> q = new LinkedList<>();

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] == 0) {
                    stations.add(new Point(i, j));
                }
            }
        }
        for (Point station : stations) {
            int[][] tmp = new int[n.length][n[0].length];
            cnt++;
            for (boolean[] arr : visited) {
                Arrays.fill(arr, false);
            }
            q.add(station);
            visited[station.x][station.y] = true;

            while (!q.isEmpty()) {
                Point cur = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nX = cur.x + dx[i];
                    int nY = cur.y + dy[i];

                    if (nX < 0 || nY < 0 || nX > n.length - 1 || nY > n[0].length - 1 || n[nX][nY] == 0 || visited[nX][nY]) {
                        continue;
                    }
                    if (cnt > 1) {
                        tmp[nX][nY] = tmp[cur.x][cur.y] + 1;
                        if (answer[nX][nY] != 0) {
                            answer[nX][nY] = Math.min(tmp[nX][nY], answer[nX][nY]);
                        }
                    } else if (cnt == 1) {
                        answer[nX][nY] = answer[cur.x][cur.y] + 1;
                    }
                    q.add(new Point(nX, nY));
                    visited[nX][nY] = true;
                }
            }
        }
        return answer;
    }

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
