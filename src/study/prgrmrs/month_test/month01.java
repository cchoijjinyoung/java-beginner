package study.prgrmrs.month_test;

import java.util.*;

public class month01 {
    static Point hPoint;
    static Point[] kPoint = new Point[2];
    static int[] kX = {2, 2, 1, 1, -2, -2, -1, -1, 0};
    static int[] kY = {-1, 1, -2, 2, -1, 1, -2, 2, 0};
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

        System.out.println("hPoint = " + hPoint);

        for (Point curK : kPoint) {
            int curKX = curK.x;
            int curKY = curK.y;

            // 8방향 move
            for (int i = 0; i < 8; i++) {
                int[][] dp = new int[board.length][board[0].length];
                boolean[][] visited = new boolean[board.length][board[0].length];

                int nextKX = curKX + kX[i];
                int nextKY = curKY + kY[i];

                // K가 움직인 좌표 : 밖 || H || X면 안된다.
                if (nextKX < 0 || nextKY < 0 || nextKX >= board.length || nextKY >= board[0].length || board[nextKX][nextKY].equals("H") || board[nextKX][nextKY].equals("X")) {
                    continue;
                }
                int min = Integer.MAX_VALUE;

                // 적군이거나 빈 공간에 도착했으면
                // 다음 좌표를 tmp 변수에 저장한 뒤, K로 변경한다.
                // 이번 방향이 끝난 뒤에 원래 board상태로 되돌리기 위함이다.
                String tmp = board[nextKX][nextKY];
                board[nextKX][nextKY] = "K";
                board[curKX][curKY] = "B";

                // H좌표부터 0으로 시작해서 E까지의 거리 계산
                q.offer(hPoint);
                visited[hPoint.x][hPoint.y] = true;
                dp[hPoint.x][hPoint.y] = 0;

                while (!q.isEmpty()) {
                    Point cur = q.poll();
                    for (int j = 0; j < 4; j++) {
                        int nextX = cur.x + dX[j];
                        int nextY = cur.y + dY[j];

                        // H가 움직인 좌표 : 밖 || 벽 || 기사 || visited면 안됨
                        if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length
                                || board[nextX][nextY].equals("X") || board[nextX][nextY].equals("K")
                                || visited[nextX][nextY]) {
                            continue;
                        }

                        // 빈 공간이나 E라면
                        Point next = new Point(nextX, nextY);
                        q.offer(next);
                        visited[nextX][nextY] = true;
                        dp[nextX][nextY] = dp[cur.x][cur.y] + 1;
                        if (board[nextX][nextY].equals("E")) {
                            if (min > dp[nextX][nextY]) {
                                min = dp[nextX][nextY];
                            }
                        }
                    }
                }
                // 이 번 사이클의 가장 가까운 적의 거리를 mins배열에 담는다.
                mins.add(min);
                // board를 원래 상태로 되돌려놓는다.(K 원상복귀, (nextKX, nextKY) 좌표에 원래값 넣기)
                board[nextKX][nextKY] = tmp;
                board[curKX][curKY] = "K";
            }
        }
        // 모든 방향을 탐색했으면 그 중 가장 거리가 먼 min을 answer에 넣어줄 것이다.
        Collections.sort(mins, (x, y) -> y - x);

        // min이 MAX_VALUE면 H와 E가 만난 적 없단 뜻이므로 0을 반환.
        answer = (mins.get(0) == Integer.MAX_VALUE) ? 0 : mins.get(0);

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
