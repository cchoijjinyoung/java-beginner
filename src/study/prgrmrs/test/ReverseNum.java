package study.prgrmrs.test;

import java.util.HashMap;
import java.util.Map;

public class ReverseNum {

    public static void main(String[] args) {
        int answer = 0;
        int num = -1000009;
        String op = "+";
        if (num < 0) {
            op = "-";
        }

        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if ("-".equals(op)) {
            answer = Integer.parseInt(sb.substring(0, sb.length() - 1));
            answer = answer - 2 * answer;
        } else {
            answer = Integer.parseInt(sb.toString());
        }
        if (answer > 1000000 || answer < -1000000) {
            answer = 0;
        }
        // return answer;
        System.out.println("a = " + answer);
    }
}
