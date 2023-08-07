package study;

import java.util.ArrayList;

public class Exam5 {

    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] bl = {false, true, true, true, true, false, false};

        // [rank[i], i]
        ArrayList<int[]> al = new ArrayList<>();

        for (int i = 0; i < bl.length; i++) {
            if (bl[i]) {
                al.add(new int[]{rank[i], i});
                // {7, 1}
                // {2, 2}
                // {5, 3}
                // {4, 4}
            }
        }
        al.sort((a, b) -> a[0] - b[0]); // 오름차순 정렬
        // {2, 2} - al[0]
        // {4, 4} - al[1]
        // {5, 3} - al[2]
        // {7, 1} - al[3]
        int answer = al.get(0)[0] * 10000 + al.get(1)[0] * 100 + al.get(2)[0];
        System.out.println(answer);
    }
}
