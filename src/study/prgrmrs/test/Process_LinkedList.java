package study.prgrmrs.test;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Process_LinkedList {
    public static void main(String[] args) {
        solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println();
        solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println();
        solution(new int[]{2, 1, 4, 3, 8, 1}, 3);

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        LinkedList<Integer> processes =  new LinkedList<>();
        LinkedList<Integer> locations = new LinkedList<>();

        // list에 배열을 담는다.
        for (int i = 0; i < priorities.length; i++) {
            processes.add(priorities[i]);
            locations.add(i);
        }

        while (!processes.isEmpty()) {
            boolean isPriority = true;
            int curPrio = processes.poll();
            int curIdx  = locations.poll();
            for (int prio : processes) {
                if (prio > curPrio) {
                    isPriority = false;
                    break;
                }
            }

            if (isPriority) {
                answer++;
                if (curIdx == location) {
                    break;
                }
            } else {
                processes.add(curPrio);
                locations.add(curIdx);
            }
        }
        System.out.println(answer);
        return answer;
    }
}
