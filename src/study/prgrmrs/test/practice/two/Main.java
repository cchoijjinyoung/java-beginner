package study.prgrmrs.test.practice.two;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        solution("de2{afew}w3{rq5{f}}");
    }

    public static String solution(String code) {
        String answer = "";
        int idx = 0;

        Stack<Integer> opens = new Stack<>();

        while (idx < code.length()) {
            if ("{".equals(code.substring(idx, idx + 1))) {
                opens.push(idx);
            } else if ("}".equals(code.substring(idx, idx + 1))) {
                StringBuilder sb = new StringBuilder();
                int from = opens.pop();
                int to = idx;
                int repeatNum = Integer.parseInt(code.substring(from - 1, from));
                String pre = code.substring(from - 1, to + 1);
                for (int i = 0; i < repeatNum; i++) {
                    sb.append(code.substring(from + 1, to));
                }
                code = code.replace(pre, sb.toString());
                idx += sb.length() - pre.length() - 1;
            }
            idx++;
        }
        System.out.println(code);
        return answer;
    }
}