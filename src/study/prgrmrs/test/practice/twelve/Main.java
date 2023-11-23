package study.prgrmrs.test.practice.twelve;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(6, 6, new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {1, 1, 1, 0, 0, 0}
        }));
    }

    public static int solution(int N, int M, int[][] maze) {
        int answer = Integer.MAX_VALUE;
        int min = 0;

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 0) {
                    continue;
                } else if (maze[i][j] == 1) {
                    maze[i][j] = 0;
                    min = escape(N, M, maze);
                    if (min < answer) {
                        answer = min;
                    }
                    maze[i][j] = 1;
                }
            }
        }
        return answer;
    }

    public static int escape(int N, int M, int[][] maze) {
        int[][] map = new int[N][M];
        Queue<Point> q = new LinkedList<>();
        boolean[][] isVisited = new boolean[N][M];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Point start = new Point(0, 0);
        isVisited[0][0] = true;
        q.add(start);
        while (!q.isEmpty()) {
            Point cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = cur.x + dx[i];
                int nextY = cur.y + dy[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M ||
                        maze[nextX][nextY] == 1 || isVisited[nextX][nextY]) {
                    continue;
                }
                map[nextX][nextY] = map[cur.x][cur.y] + 1;
                isVisited[nextX][nextY] = true;
                q.add(new Point(nextX, nextY));

            }
        }
        return map[N - 1][M - 1];
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
