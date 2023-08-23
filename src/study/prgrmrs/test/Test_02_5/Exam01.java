package study.prgrmrs.test.Test_02_5;

public class Exam01 {
    public static void main(String[] args) {
        String sentence = "bbb bbb bbb";
        String word = "bbb";
        int answer = 0;
        int cnt = 0;
        boolean success = false;

        String[] sArr = sentence.split(" ");

        for (String x : sArr) {
            if (x.equalsIgnoreCase(word)) {
                answer = cnt;
                success = true;
            }
            cnt++;
        }
        if (success == false) answer = -1;
        System.out.println(answer);
    }
}
