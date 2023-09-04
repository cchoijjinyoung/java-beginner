package study.prgrmrs.month_test;

import java.util.*;

public class month01 {
    static Point hPoint;
    static Point[] kPoint = new Point[2];
    static int[] kX = {2, 2, 1, 1, -2, -2, -1, -1};
    static int[] kY = {-1, 1, -2, 2, -1, 1, -2, 2};
    static int[] dX = {1, 0, -1, 0};
    static int[] dY = {0, -1, 0, 1};
    static List<Integer> mins = new ArrayList<>();
    static Queue<Point> q = new LinkedList<>();

    public static void main(String[] args) {
        solutoin(5, new String[][]{
                {"B", "K", "B", "B", "B"},
                {"B", "K", "E", "E", "B"},
                {"B", "B", "E", "X", "B"},
                {"B", "B", "X", "X", "B"},
                {"H", "B", "X", "B", "E"}
        });
    }

    public static int solutoin(int N, String[][] board) {
        int answer = 0;
        int kCnt = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("H")) {
                    hPoint = new Point(i, j);
                } else if (board[i][j].equals("K")) {
                    kPoint[kCnt] = new Point(i, j);
                    kCnt++;
                }
            }
        }

        System.out.println(hPoint);

        for (Point curK : kPoint) {
            int curKX = curK.x;
            int curKY = curK.y;

            // 8방향 move
            for (int i = 0; i < 8; i++) {
                String[][] tmp = board.clone();
                int[][] dp = new int[tmp.length][tmp[0].length];
                boolean[][] visited = new boolean[tmp.length][tmp[0].length];

                int nextKX = curKX + kX[i];
                int nextKY = curKY + kY[i];

                // 움직인 곳이 밖이거나, H면 안된다.
                if (nextKX < 0 || nextKY < 0 || nextKX >= tmp.length || nextKY >= tmp[0].length || tmp[nextKX][nextKY].equals("H") || tmp[nextKX][nextKY].equals("X")) {
                    continue;
                }
                int min = Integer.MAX_VALUE;
                // 적군이거나 빈 공간에 도착했으면
                tmp[nextKX][nextKY] = "K";
                tmp[curKX][curKY] = "B";

                // H부터 시작해서 E를 만나는 거리 계산
                q.offer(hPoint);
                visited[hPoint.x][hPoint.y] = true;
                dp[hPoint.x][hPoint.y] = 0;

                while (!q.isEmpty()) {
                    Point cur = q.poll();
                    for (int j = 0; j < 4; j++) {
                        int nextX = cur.x + dX[j];
                        int nextY = cur.y + dY[j];

                        // 밖을 나가거나 벽, 기사, 방문했으면 안됨
                        if (nextX < 0 || nextY < 0 || nextX >= tmp.length || nextY >= tmp[0].length
                                || tmp[nextX][nextY].equals("X") || tmp[nextX][nextY].equals("K")
                                || visited[nextX][nextY]) {
                            continue;
                        }

                        // 빈 공간이나 E라면
                        Point next = new Point(nextX, nextY);
                        q.offer(next);
                        visited[nextX][nextY] = true;
                        dp[nextX][nextY] = dp[cur.x][cur.y] + 1;
                        if (tmp[nextX][nextY].equals("E")) {
                            if (min > dp[nextX][nextY]) {
                                min = dp[nextX][nextY];
                            }
                        }
                    }
                }
                mins.add(min);
            }
        }
        Collections.sort(mins, (x, y) -> y - x);
        answer = mins.get(0);
        if (answer == Integer.MAX_VALUE) {
            System.out.println(answer);
            return 0;
        }
        System.out.println(answer);
        return answer;
    }

   public static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point() {}

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
