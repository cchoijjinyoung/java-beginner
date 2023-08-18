package study.prgrmrs.test;

public class Main5 {
    public static void main(String[] args) {
        solution(1, "A", 20);
    }


    public static String solution(int n, String s, int t) {
        String answer = "";
        String dot = "";
        for (int i = 0; i < n; i++) {
            dot += ".";
        }
        String str = s + dot;

        int x = t % str.length();
        if (x == 0) {
            answer = str.substring(s.length());
            System.out.println(answer);
            return answer;
        }
        if (x < n) {
            answer = str.substring(str.length() + (x - n)) + str.substring(0, n + (x - n));
            return answer;
        }
        answer = str.substring(x - n, x);

        System.out.println(answer);
        return answer;
    }
}