package study.prgrmrs.test.practice.four;

import java.util.ArrayList;
import java.util.List;

public class Three {
    public static void main(String[] args) {

    }

    public static String[][] solution(String[] words, String[] queries) {
        String[][] answer = new String[queries.length][];

        for (int i = 0; i < queries.length; i++) {
            List<String> tmpArr = new ArrayList<>();
            for (int j = 0; j < words.length; j++) {
                if (queries[i].length() != words[j].length()) continue;

                int index = queries[i].indexOf("?");
                String query = queries[i].substring(0, index);
                String target = words[j].substring(0, query.length());
                if (query.equals(target)) {
                    tmpArr.add(words[j]);
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
