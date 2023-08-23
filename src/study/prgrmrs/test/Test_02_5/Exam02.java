package study.prgrmrs.test.Test_02_5;

public class Exam02 {
    public static void main(String[] args) {
        int answer = -1;
        int[] nums = {1, 3, 5, 3, 2};
        int n = 3;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
