package study.prgrmrs.test.practice.Six;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Four {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 4, 2, 3};
        int k = 3;
        int[] answer = new int[arr.length - k + 1];

        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }


        for (int i = k + 1; i < arr.length; i++) {

        }

    }
}
