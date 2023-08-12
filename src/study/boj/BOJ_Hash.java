package study.boj;

import java.util.HashMap;
import java.util.Hashtable;

class MyHashMap extends Hashtable {

}

public class BOJ_Hash {
    public static void main(String[] args) {
        solution(3, 2, 4, 8);
    }

    public static int solution(int N, int M, int A, int H) {
        int answer = 0;
        int repeatCnt = 0;
        int powNum = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int p = 0; p < N; p++) {
            for (int i = 0; i < M; i++) {
                hm.put(p, hm.getOrDefault(p, 0) + i);
            }
        }
        while (repeatCnt < N) {
            for (int i = 0; i < M; i++) {
                sum += i * Math.pow(A, powNum);
            }
            powNum++;
        }
        return answer;
    }
}
