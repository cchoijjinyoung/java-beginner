package study.prgrmrs.test.Test_03_3;

public class Main {
    public static void main(String[] args) {
        solution(new int[]{-1, -2, -3, -2, -1, -1, 0, 2, -1});
    }
    public static int solution(int[] fruits) {
        int answer = fruits[0];
        int maxIdx = 0;
        int[] arr = new int[fruits.length];
        int lt = 0;
        int rt = 1;
        for (int i = 1; i < fruits.length; i++) {
            arr[i] += fruits[rt];

        }

        return answer;
    }
}