package study;

import mini.virtualvote.Player;

import java.util.LinkedList;
import java.util.List;

public class nakseojang {

    public static void main(String[] args) {

        solution(new int[]{1,1,2,2,2,3,3,3,3,3,4,4,4,5});
        System.out.println();
        solution(new int[]{0,0,0,3,3,3,5,7,7,7});
        System.out.println();
        solution(new int[]{1,2,3,4,5,6,7,7,7,8,9});
        System.out.println();
        solution(new int[]{0, 1, 1, 1, 2, 2, 2});
        System.out.println();
    }

    public static int[] solution(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

//        int cur = 0;
//        int next = cur + 1;
//        while (next < list.size()) {
//            if (list.get(cur) == list.get(next)) {
//                list.remove(next);
//            } else {
//                cur += 1;
//                next += 1;
//            }
//        }
        while (!list.isEmpty()) {
            int cur = list.poll();
            if (list.poll() == list.peek()) {
                continue;
            } else {
                list.addLast(cur);
            }
        }
        for (int x : list) {
            System.out.print(x);
        }
        return new int[]{1};
    }
}
