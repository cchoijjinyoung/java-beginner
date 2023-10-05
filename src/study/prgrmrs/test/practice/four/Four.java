package study.prgrmrs.test.practice.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four {
    public static void main(String[] args) {
        // solution(new int[]{0, 2, 3, 5, 6}, new int[]{2, 4, 2, 1, 3});
        solution(new int[]{4, 2, 7, 2, 6}, new int[]{5, 2, 5, 4, 3});
    }

    public static int[] solution(int[] start, int[] time) {
        int[] answer = new int[start.length];
        boolean[] visited = new boolean[start.length];
        int lastTime = Arrays.stream(start).min().getAsInt();

        for (int j = 0; j < start.length; j++) {
            int curProcess = -1;
            List<Integer> readyProcesses = new ArrayList<>();
            for (int i = 0; i < start.length; i++) {
                if (visited[i]) continue;
                if (start[i] <= lastTime) {
                    readyProcesses.add(i);
                }
            }
            if (readyProcesses.size() > 1) {
                int minTime = Integer.MAX_VALUE;
                for (int process : readyProcesses) {
                    if (time[process] < minTime) {
                        minTime = time[process];
                        curProcess = process;
                    }
                }
            } else if (readyProcesses.size() == 1) {
                curProcess = readyProcesses.get(0);
            } else if (readyProcesses.size() == 0) {
                lastTime++;
                continue;
            }
            visited[curProcess] = true;
            answer[j] = curProcess;
            lastTime += time[curProcess];
        }
        return answer;
    }
}