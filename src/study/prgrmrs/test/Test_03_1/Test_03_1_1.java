//package study.prgrmrs.test.Test_03_1;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Test_03_1_1 {
//    public static void main(String[] args) {
//        boolean answer = true;
//        int[] arr = new int[]{1, 3, 5, 4, 3, 1, 1};
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int x : arr) {
//            hm.put(x, hm.getOrDefault(x, 0) + 1);
//        }
//        List<Integer> A = new ArrayList<>();
//
//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            A.add(entry.getValue());
//        }
//
//        for (int i = 0; i < A.size() - 1; i++) {
//            for (int j = i + 1; j < A.size(); j++) {
//                if (A.get(i) == A.get(j)) {
//                    return false;
//                }
//            }
//        }
//        return answer;
//    }
//}
