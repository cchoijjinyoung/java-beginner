package study;

import mini.virtualvote.Player;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class nakseojang {

    public static void main(String[] args) {

//        solution(new int[]{1,1,2,2,2,3,3,3,3,3,4,4,4,5});
//        System.out.println();
//        solution(new int[]{0,0,0,3,3,3,5,7,7,7});
//        System.out.println();
//        solution(new int[]{1,2,3,4,5,6,7,7,7,8,9});
//        System.out.println();
//        solution(new int[]{0, 1, 1, 1, 2, 2, 2});
//        System.out.println();

    }

//    public static int[] solution(int[] nums) {
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//
////        int cur = 0;
////        int next = cur + 1;
////        while (next < list.size()) {
////            if (list.get(cur) == list.get(next)) {
////                list.remove(next);
////            } else {
////                cur += 1;
////                next += 1;
////            }
////        }
//        while (!list.isEmpty()) {
//            int cur = list.poll();
//            if (list.poll() == list.peek()) {
//                continue;
//            } else {
//                list.addLast(cur);
//            }
//        }
//        for (int x : list) {
//            System.out.print(x);
//        }
//        return new int[]{1};
//    }

//    public static int solution(int[][] sizes) {
//        int widthMax = 0;
//        int heightMax = 0;
//
//        for (int[] size : sizes) {
//            if (size[0] < size[1]) {
//                int tmp = size[0];
//                size[0] = size[1];
//                size[1] = tmp;
//            }
//            if (size[0] > widthMax) {
//                widthMax = size[0];
//            }
//            if (size[1] > heightMax) {
//                heightMax = size[1];
//            }
//        }
//        return widthMax * heightMax;
//    }
//
// Math.max, min으로 풀 수 있다.
    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }
        return width * height;
    }

    public static int[] solution2(int[] answers) {
        int person1 = 0, person2 = 0, person3 = 0;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) {
                person1++;
            }
            if (answers[i] == arr2[i % arr2.length]) {
                person2++;
            }
            if (answers[i] == arr3[i % arr3.length]) {
                person3++;
            }
        }
        int max = Math.max(person3, Math.max(person1, person2));
        List<Integer> winner = new ArrayList<>();
        if (person1 == max) {
            winner.add(1);
        }
        if (person2 == max) {
            winner.add(2);
        }
        if (person3 == max) {
            winner.add(3);
        }
        int[] answer = winner.stream().mapToInt(i -> i.intValue()).toArray();

        return answer;
    }
}
