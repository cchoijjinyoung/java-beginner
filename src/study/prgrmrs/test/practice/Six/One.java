package study.prgrmrs.test.practice.Six;

public class One {
    public static void main(String[] args) {
        solution(new int[]{0, 0, 0, 0, 0, 0, 0});
    }

    public static int[] solution(int[] values) {
        int[] answer = {0, 0};
        int len = 0;
        int start = 0;
        int lt = 0;
        int rt = 1;
        while (rt < values.length) {
            if (values[lt] < values[rt]) {
                lt++;
                rt++;
            } else {
                if (len < rt - start) {
                    len = rt - start;
                    answer[0] = start;
                    answer[1] = rt - 1;
                }
                start = rt;
                lt = start;
                rt = lt + 1;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }
}
