package study.prgrmrs.test;

import java.util.HashMap;
import java.util.Stack;

public class gwalho {
    public static void main(String[] args) {
        String S = "({)}[<]>";
        int answer = -1;
        int success = 1;
        Stack<Character> stack = new Stack();
        HashMap<Character, Integer> opener = new HashMap<>();
        HashMap<Character, Integer> closer = new HashMap<>();

        opener.put('(', 1);
        closer.put(')', 1);

        opener.put('{', 2);
        closer.put('}', 2);

        opener.put('[', 3);
        closer.put(']', 3);

        opener.put('<', 4);
        closer.put('>', 4);
        int openerVal = 0;

        for (char c : S.toCharArray()) {
            if (stack.isEmpty()) { // 스택이 비어있으면
                if (closer.containsKey(c)) { // 비어있는데 닫힘이 온다면
                    answer = 0;
                    break;
                } else if (opener.containsKey(c)) { // 열림이 온다면
                    stack.push(c);
                }
            } else { // 스택이 안비어있고
                if (closer.containsKey(stack.peek())) { // 스택의 최상단이 닫힘이면
                    answer = 0;
                    break;
                } else if (opener.containsKey(stack.peek())){ // 최상단이 열림이고
                    if (opener.containsKey(c)) { // c가 열림괄호면
                        stack.push(c);
                    } else if (closer.containsKey(c)) { // c가 닫힘괄호면
                        if (opener.get(stack.peek()) == closer.get(c)) { // 같은 종류의 괄호면 stack pop
                            stack.pop();
                        } else {
                            answer = 0;
                            break;
                        }
                    }
                }

            }
        }
        answer = 1;
        System.out.println(answer);
    }
}
