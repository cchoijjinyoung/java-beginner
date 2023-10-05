package study.prgrmrs.test.practice.four;

import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {

    }

    public static String[][] solution(String[] titles, String[] lyrics, String[] problems) {
        String[][] answer = new String[problems.length][];
        for (int  i = 0; i < problems.length; i++) {
            String problem = problems[i];
            List<String> tmpArr = new ArrayList<>();
            for (int j = 0; j < lyrics.length; j++) {
                if (problem.equals(lyrics[j].substring(0, problem.length()))) {
                    tmpArr.add(titles[i]);
                }
            }
            answer[i] = new String[tmpArr.size()];
            for (int k = 0; k < tmpArr.size(); k++) {
                answer[i][k] = tmpArr.get(k);
            }
        }
        return answer;
    }
}
