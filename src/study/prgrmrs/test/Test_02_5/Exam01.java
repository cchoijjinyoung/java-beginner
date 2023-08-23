package study.prgrmrs.test.Test_02_5;

public class Exam01 {
    public static void main(String[] args) {
        String sentence = "Hello every World";
        String word = "";
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
        if (success == false || word.length() == 0) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
