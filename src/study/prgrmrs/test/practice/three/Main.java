//package study.prgrmrs.test.practice.three;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
//        solution(5);
//    }
//
//    public static int solution(int N, int[][] trust) {
//        int answer = 0;
//        boolean[] pansa = new boolean[N + 1];
//        Map<Integer, Integer> hs = new HashMap<>();
//
//        for (int i = 0; i < trust.length; i++) {
//            if (pansa[trust[i][0]] == false) {
//                pansa[trust[i][0]] = true;
//            }
//            hs.put(trust[i][1], hs.getOrDefault(trust[i][1], 0) + 1);
//        }
//
//        for (int i = 1; i < N; i++) {
//            if (pansa[i] == false) {
//                if (hs.get(i) == N - 1) return i;
//            }
//        }
//        return -1;
//    }
//}
