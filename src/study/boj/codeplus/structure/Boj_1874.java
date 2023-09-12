package study.boj.codeplus.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            Stack<String> stack = new Stack<>();
            String[] arr = br.readLine().split("");

            for (String s : arr) {
                if ("(".equals(s)) {
                    stack.push(s);
                } else if (")".equals(s) && stack.size() != 0) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.add(s);
                        break;
                    }
                } else {
                    stack.add(s);
                    break;
                }
            }
            if (stack.size() != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
