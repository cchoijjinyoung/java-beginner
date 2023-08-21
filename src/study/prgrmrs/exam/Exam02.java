package study.prgrmrs.exam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Exam02 {

    public static void main(String[] args) {

        solution(new int[]{1, 2, 3}, "right");
    }

    public static int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }

        if ("left".equals(direction)) {
            list.addLast(list.removeFirst());
        } else {
            list.addFirst(list.removeLast());
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.removeFirst();
            System.out.println(answer[i]);
        }

        return answer;
    }
}

