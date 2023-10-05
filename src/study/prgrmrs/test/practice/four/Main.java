package study.prgrmrs.test.practice.four;

public class Main {
    public static void main(String[] args) {
    }

    public static int[][] solution(int[][] buildings) {
        int[][] answer = {};
        int[] lefts = new int[buildings.length];
        int[] rights = new int[buildings.length];
        int[] heights = new int[buildings.length];
        int curX = 0;

        for (int i = 0; i < buildings.length; i++) {
            lefts[i] = buildings[i][0];
            lefts[i] = buildings[i][1];
            lefts[i] = buildings[i][2];
        }

        int lastY = 0;
        for (int i = 0; i < buildings.length; i++) {
            int left = lefts[i];
            int height = heights[i];

        }
        return answer;
    }
}