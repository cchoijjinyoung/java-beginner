package study.prgrmrs.test.practice.twelve;

import java.util.*;

class Solution {
    public int solution(int N, int M, int[][] maze) {
        int answer = 0;
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
                }
            }
        }
        return answer;
    }

    public int escape(int N, int M, int[][] maze) {
        int[][] map = maze.clone();
        Queue<Point> q = new LinkedList<>();
        boolean[][] isVisited = new boolean[N][M];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Point start = new Point(0, 0);
        isVisited[0][0] = true;
        q.add(start);

        for (int i = 0; i < 4; i++) {
            Point cur = q.poll();
            int nextX = cur.x + dx[i];
            int nextY = cur.y + dy[i];

            if (nextX < 0 || nextX >= M || nextY < 0 || nextY >= N ||
                    maze[nextX][nextY] == 1 || isVisited[nextX][nextY]) {
                continue;
            }
            map[nextX][nextY] = map[cur.x][cur.y] + 1;
            isVisited[nextX][nextY] = true;
            q.add(new Point(nextX, nextY));
        }
        return map[N - 1][M - 1];
    }

    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
