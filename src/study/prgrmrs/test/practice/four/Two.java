package study.prgrmrs.test.practice.four;

public class Two {
    public static void main(String[] args) {
        solution(new String[]{"hello", "hell", "good", "goose", "children", "card", "teachable"}, new String[]{"hell*", "goo*", "*able", "qua*"});
    }

    public static int[] solution(String[] words, String[] queries) {
        String test = "test";
        System.out.println(test.substring(2));
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (queries[i].length() - 1 > words[i].length()) continue;

                String query = "";
                String target = "";
                if (queries[i].charAt(0) == '*') {
                    query = queries[i].substring(1);
                    target = words[j].substring(words[j].length() - query.length());
                } else {
                    query = queries[i].substring(0, queries[i].length() - 1);
                    target = words[j].substring(0, query.length());
                }
                if (target.equals(query)) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
