package study.prgrmrs.test.Test_02_4;

import java.util.LinkedList;

public class Exam03 {
    public static void main(String[] args) {
        int answer = 0;
        String S1 = "HelloWorld";
        String S2 = "WorldHello";
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> list2 = new LinkedList<>();

        for (char c : S1.toCharArray()) {
            list.add(c);
        }

        for (char c : S2.toCharArray()) {
            list2.add(c);
        }

        for (int i = 0; i < list.size(); i++) {
            String s2 = list2.toString();
            list.addLast(list.removeFirst());
            String s = list.toString();
            if (s.equals(s2)) {
                answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
}
