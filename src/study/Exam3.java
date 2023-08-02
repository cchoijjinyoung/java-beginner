//package study;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Exam3 {
//    public static int[] solution(int[] arr) {
//        List<Integer> answer = new ArrayList<Integer>();
//        for (int i : arr) {
//            for (int j = 0; j < i; j++) {
//                answer.add(i);
//            }
//        }
//        return answer.toArray(new Integer[0]);
//        int length = 0;
//        for (int i = 0; i < arr.length; i++) {
//            length += arr[i];
//        }
//        int[] answer = new int[length];
//        for (int i : arr) {
//            for (int j = 0; j < i; j++) {
//                answer[j] = i;
//            }
//        }
////        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
//        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
//        System.out.println(Arrays.toString(solution(new int[]{1})));
//    }
//}
