package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack stack2 = new Stack();
        stack2.push("data3");
        stack2.push(1);
        System.out.println(stack2.size());
        for (int i = 0; i < stack2.size(); i++) {
            System.out.println(stack2.pop());
        }


    }
}
