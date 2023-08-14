package study.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class VPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack();
            String s =  br.readLine();

            for (char c : s.toCharArray()) {
                if (stack.isEmpty() && c == '(') {
                    stack.push(c);
                } else if (stack.isEmpty() && c == ')') {
                    System.out.println("NO");
                    break;
                } else {
                    if (c == ')') {
                        stack.pop();
                    } else if (c == '('){
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
