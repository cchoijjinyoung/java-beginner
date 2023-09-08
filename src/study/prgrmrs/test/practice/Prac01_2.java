package study.prgrmrs.test.practice;

import java.util.HashSet;
import java.util.Set;

public class Prac01_2 {

    public static void main(String[] args) {
        solution(new String[]{"제로", "베이스", "자바", "스쿨", "백엔드", "화이팅"});
    }

    public static int solution(String[] names) {
        int answer = 1;
        Set<String> hs = new HashSet<>();
        for (String s : names) {
            hs.add(s);
        }

        answer = hs.size() * (hs.size() - 1) / 2;
        System.out.println(answer);
        return answer;
    }
}
